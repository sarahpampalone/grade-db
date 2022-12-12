public class gradedb{
  public static void main(String [] args){
    String [] names = {"Ben", "Abby", "Dan", "Charlie"};
    int [] sortedNameIndex = {1,0,3,2};
    int [][] tDArray = new int[names.length][3];
    java.util.Random r = new java.util.Random();
    
    for(int i = 0; i < tDArray.length; i++){
      tDArray[i][0] = r.nextInt(100);
      tDArray[i][1] = r.nextInt(100);
      tDArray[i][2] = r.nextInt(100);
    }
    
    for(int i = 0; i < tDArray.length; i++){
      java.util.Arrays.sort(tDArray[i]);
    }
    
    for(int i = 0; i < sortedNameIndex.length; i++){
      System.out.println("Student Name : " + names[sortedNameIndex[i]]); //the name pointed to be assigned index
      for(int j = 0; j < tDArray[i].length; j++){
        System.out.println("       Grade : " + tDArray[sortedNameIndex[i]][j]);
      }
    }
  }
}
