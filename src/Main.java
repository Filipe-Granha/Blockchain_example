import java.util.ArrayList;

public class Main {
    ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {
        String[] genesisTransactions = {"Satoshi sent Filipe 1000 bitcoins", "Ben sent Ian 15 bitcoins"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"Filipe sent 10 bitcoins to Satoshi, Peter sent 50 bitcoins to Jack"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        String[] block3Transactions = {"Filipe sent 10 bitcoins to Parker, Jude sent 50 bitcoins to Marie"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);

        // Changing, adding or deleting any character inside any of the Transactions will modify
        // the subsequent hashes, proving that something has been altered, as each block's hash
        // is created taking into consideration the previous block's hash

        System.out.println("-504799446 is genesisBlock hash, is this correct?");
        System.out.println(genesisBlock.getBlockHash());
        System.out.println("-562377951 is block 2 hash, is this correct?");
        System.out.println(block2.getBlockHash());
        System.out.println("448901003 is block 3 hash, is this correct?");
        System.out.println(block3.getBlockHash());
    }
}