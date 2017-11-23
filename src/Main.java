public class Main
{
    public static void main (String[] args){

      UI ui = new UI();
      ui.initializeUI();
/*String code = "class joanna{\n" +
        "      void main(){\n" +
        "\tint counter = 10;\n" +
        "\tint counter2 = 20;\n" +
        "\tint counter3 = counter1 + counter2;\n" +
        "\tint test = 10 + 10;\n" +
        "\n" +
        "\t}\n" +
        "\n" +
        "\n" +
        "}\t";

System.out.print(code);
        ANTLRInputStream input = new ANTLRInputStream(code);

        JuicyBoysLexer lexer = new JuicyBoysLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JuicyBoysParser parser = new JuicyBoysParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.compilationUnit();
        JuicyBoysBaseVisitorCustom visitor = new JuicyBoysBaseVisitorCustom();

        visitor.visit(tree);
        JFrame frameTree = new JFrame("Antlr AST");
        JPanel panelTree = new JPanel();
        JScrollPane scrollPanePanelTree = new JScrollPane( panelTree );
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewr.setScale(1.5);//scale a little
        panelTree.add(viewr);

        frameTree.add(scrollPanePanelTree);
        frameTree.setSize(500,500);
        frameTree.setVisible(true);*/
    }
}
