public class TieRopes {
    public int solution(int K, int[] A) {
        int parca=0;
        int halat=0;

        for (int i =0;i<A.length;i++){
            parca = parca+A[i];
            if (parca>=K){
                halat++;
                parca=0;
            }
        }
        return halat;
    }
    public static void main(String[] args){
        Integer a=new TieRopes().solution(4,new int[]{1,2,3,4,1,1,3});
        System.out.println(a);
    }
}
