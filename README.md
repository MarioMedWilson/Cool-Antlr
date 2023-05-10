# Cool Antlr

## Parser
As parsser is done in top-down parsing, left-to-right. Examples:
```
class Program {
  int foo() {
    return 0;
  }
}
```
## Output

Lexer Analysis 
```
CLASS                class
PROGRAM              Program
LCURLY               {
INT                  int
ID                   foo
LROUND               (
RROUND               )
LCURLY               {
RETURN               return
DECIMAL_LITERAL      0
SEMICOLON            ;
RCURLY               }
RCURLY               }
```
Parsing

<img width="599" alt="ParserTree" src="https://github.com/MarioMedWilson/Cool-Antlr/assets/89283049/ac688f34-e164-46e7-9545-479951335ee6">

### Requirements 
1. Java 11
2. Antlr 4.12.0 [Link](https://plugins.jetbrains.com/plugin/7358-antlr-v4/versions/stable/314207)
