public class Main {

    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(120,
                12, TreeType.OAK);

        myFavoriteOakTree.announceTallTree();

        Tree myFavoriteMapleTree = new Tree(90,
                30, TreeType.MAPLE);

        myFavoriteMapleTree.announceTallTree();

        System.out.println(myFavoriteOakTree.treeType);

        /*if(myFavoriteOakTree.heightFt > 100) {
            System.out.println("That's a tall " +
                    myFavoriteOakTree.treeType +" tree!");
        }*/

        /*if(myFavoriteMapleTree.heightFt > 100) {
            System.out.println("That's a tall " +
                    myFavoriteMapleTree.treeType +" tree!");
        }*/

    }
}
