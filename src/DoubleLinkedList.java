public class DoubleLinkedList {

   DoubleLinkedInt[] listStart = new DoubleLinkedInt[0];

   public void add(int value)
   {
       if(!contains(value)) {
           DoubleLinkedInt[] tempList = new DoubleLinkedInt[listStart.length + 1];

           int i;

           for (i = 0; i < listStart.length; i++) {
               tempList[i] = listStart[i];
           }
           i++;
           tempList[i] = new DoubleLinkedInt(value);

           listStart = tempList;
       }
       System.out.println("value already exists in list");
   }

   public void remove(int value)
   {

       if(contains(value)) {
           DoubleLinkedInt[] tempList = new DoubleLinkedInt[listStart.length - 1];

           for (int i = 0; i < listStart.length; i++) {
               if (listStart[i].getValue() != value) {
                   tempList[i] = listStart[i];
               }
           }

           listStart = tempList;
       }

   }

   public boolean contains(int value)
   {
       boolean contains = false;

       for(int i =0; i < listStart.length;i++)
       {
           if(listStart[i].getValue() == value){
               contains = true;
               break;
           }
       }

       return contains;
   }

   public void printList()
   {
       for (int i = 0; i < listStart.length; i++) {
           System.out.println(listStart[i].getValue());
       }
   }

}
