package list_map;

public class AlphabetPlus {
    public static void main(String[] args) {
    char [] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    for(int i=0 ; i<alphabet.length ; i++){
        for(int j=0; j<=i;j++){
            System.out.print(alphabet[j]);
        }
        System.out.println();
    }
    }
}