import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;


public class DecafTest {
    public static void main(String[] args) {
        String inputFolderPath = "YOUR INPUT PATH";
        String outputFolderPath = "YOUR OUTPUT PATH";

        File inputFolder = new File(inputFolderPath);
        File[] inputFiles = inputFolder.listFiles();

        if (inputFiles != null) {
            for (File inputFile : inputFiles) {
                if (inputFile.isFile() && inputFile.getName().endsWith(".txt")) {
                    try {
                        String input = readFile(inputFile.getAbsolutePath());
                        DecafLexer lexer = new DecafLexer(CharStreams.fromString(input));
                        CommonTokenStream tokens = new CommonTokenStream(lexer);
                        DecafParser parser = new DecafParser(tokens);
                        DecafParser.ProgramContext tree = parser.program();
                        ParseTreeWalker walker = new ParseTreeWalker();
                        String outputFilePath = outputFolderPath + File.separator + inputFile.getName().replace(".txt", ".txt");
                        TokenPrinter listener = new TokenPrinter(tokens, outputFilePath);
                        System.out.println(tree.toStringTree(parser));
                        TreeViewer viewr = new TreeViewer(Arrays.asList(
                                parser.getRuleNames()), tree);
                        viewr.open();
                        walker.walk(listener, tree);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private static String readFile(String path) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, StandardCharsets.UTF_8);
    }

    private static class TokenPrinter extends DecafBaseListener {
        private final CommonTokenStream tokens;
        private final String outputFilePath;

        public TokenPrinter(CommonTokenStream tokens, String outputFilePath) {
            this.tokens = tokens;
            this.outputFilePath = outputFilePath;
        }

        @Override
        public void visitTerminal(TerminalNode node) {
            Token token = node.getSymbol();
            String tokenName = DecafLexer.VOCABULARY.getSymbolicName(token.getType());
            String output = String.format("%-20s %s%n", tokenName, token.getText());
            try {
                Files.write(Paths.get(outputFilePath), output.getBytes(StandardCharsets.UTF_8), java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

