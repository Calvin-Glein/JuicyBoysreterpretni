import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class JuicyBoysANTLRErrorListener implements ANTLRErrorListener {

    String output = "";
    Recognizer<?, ?> recognizer;
    Object o;
    int i; int i1; String s; RecognitionException e;

    ArrayList<Integer> lineErrors = new ArrayList<Integer>();


    public ArrayList<Integer> getLineErrors(){
        return lineErrors;
    }
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int lineNumber, int charPositionInLine, String msg, RecognitionException e) {

        List<String> stack;
/*
    try {
        //for parser
        stack = ((Parser) recognizer).getRuleInvocationStack();
        Collections.reverse(stack);

        output = output + "Parser Error: ";

        output = output + "Rule stack: " + stack + "\n";

        output = output + "You have a syntax error at line: " + lineNumber + "\n";
        output = output + "At character position: " + charPositionInLine;
        output = output + " \n \n Specific Error: " + msg.toString() + "\n\n ";
    }catch (Exception e2){
        //for lexer

        stack = ((Lexer) recognizer).getRuleInvocationStack();

        output = output + "Lexer Error: ";
        output = output + "\n You have a syntax error at line: " + lineNumber + "\n";
        output = output + "At character position: " + charPositionInLine;
        output = output + " \n \n Specific Error: " + msg.toString() + "\n\n ";


    }
    */


    output = output + "Error: ";
    output = output + "\n You have a syntax error at line: " + lineNumber + "\n";
    output = output + " It is at the character position: " + charPositionInLine;
    output = output + " \n \n Specific Error: " + msg.toString() + "\n\n ";

    lineErrors.add(lineNumber);





        /*System.out.println("Rule stack: " + stack);
        System.out.println("You have a syntax error at line: " + i);
        System.out.println("At character position: " + i1);*/




      /*  JDialog dialog = new JDialog();
        Container contentPane = dialog.getContentPane();
        contentPane.add(new JLabel(msg.toString()));
        contentPane.setBackground(Color.white);
        dialog.setTitle("Syntax error");
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);*/
    }

    public Recognizer<?, ?> getRecognizer() {
        return recognizer;
    }

    public Object getO() {
        return o;
    }

    public int getI() {
        return i;
    }

    public int getI1() {
        return i1;
    }

    public String getS() {
        return s;
    }

    public RecognitionException getE() {
        return e;
    }

    public String getOutput(){
        return output;
    }


    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int lineNumber, int charPositionInLine, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {

   /*     output = output + "You have an ambiguity: ";
        output = output + "\n You have a syntax error at line: " + lineNumber + "\n";
        output = output + "At character position: " + charPositionInLine;*/
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int lineNumber, int charPositionInLine, BitSet bitSet, ATNConfigSet atnConfigSet) {

/*

        output = output + "Error: Attempting Full Context: ";
        output = output + "\n You have a syntax error at line: " + lineNumber + "\n";
        output = output + "At character position: " + charPositionInLine;*/

    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int lineNumber, int charPositionInLine, int i2, ATNConfigSet atnConfigSet) {
       /* output = output + "Error:  Context Sensitivity: ";
        output = output + "\n You have a syntax error at line: " + lineNumber + "\n";
        output = output + "At character position: " + charPositionInLine;*/


    }
}
