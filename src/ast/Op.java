package ast;

public enum Op
{
	ADD,SUB,MUL,DIV,MOD,GT,LT,GE,LE,NE,EQ,OR,AND;
	
	public <T> T accept(ASTVisitor<T> v) {
        return v.visitOp(this);
    }
}