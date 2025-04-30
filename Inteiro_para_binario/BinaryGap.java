package Inteiro_para_binario;

public class BinaryGap {
    public int solution(int N){
       String intAsBinary = Integer.toBinaryString(N);
        System.out.println(intAsBinary);

       int longestSeq = 0;
       int longestSeqAux= 0;

       for(int index=0; index < intAsBinary.length(); index++){
            if (intAsBinary.charAt(index) == '0'){
                longestSeqAux +=1;
            } else {
                if (longestSeqAux > longestSeq){
                    longestSeq = longestSeqAux;
                }
                longestSeqAux = 0;
            }
        }
        return longestSeq;
    }

    public static void main(String[] args) {
        System.out.println(new BinaryGap().solution(9));
    }
}
