public class ArraysecondLargest {
        public static void main(String[] args){
              int arr[] = {1,4,56,43,78,23,17,90};
             int largest = Integer.MIN_VALUE;
             int secondLargest = Integer.MIN_VALUE;
             
              for(int i = 0; i < arr.length; i++){
                if(largest < arr[i]){
                    secondLargest = largest;
                    largest = arr[i];
                } else if(arr[i] >secondLargest && largest != secondLargest){
                        secondLargest = arr[i];
                    }
                }
               System.out.println(largest);
               System.out.println(secondLargest);
              }
    }
    
