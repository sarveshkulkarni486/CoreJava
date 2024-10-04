
public class ArrayService {
    static int row;
    static int column;    
    static int arr[][];
    public static int[][] AcceptData() {
        System.out.println("Enter the number of rows and columns");
        row = ArrayTest.sc.nextInt();
        column = ArrayTest.sc.nextInt();
        System.out.println("Enter array elements: ");
        arr = new int[row][column];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print("Enter number: " +i+","+j+"---->");
                arr[i][j] = ArrayTest.sc.nextInt();
            }
        }
        return arr;
    }
    public static void DisplayData() {
        System.out.println("Array is: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();

        }
    }
    public static int AddAllNumbers() {
        int sum=0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    public static void AddRows() {
        int sum[] = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                sum[i]+=arr[i][j];
            }
        }
        for(int i=0; i<sum.length; i++) {
            System.out.println(sum[i]);
        }
    }
    public static void AddColumns() {
        int sum[] = new int[arr[0].length];
        for(int i=0; i<arr[0].length; i++) {
            for(int j=0; j<arr.length; j++) {
                sum[i]+=arr[j][i];
            }
        }
        for(int i=0; i<arr[0].length; i++) {
            System.out.println(sum[i]);
        }
    }
    public static void FindMax() {
       int max = Integer.MIN_VALUE;
       for(int i=0; i<arr.length; i++) {
        for(int j=0; j<arr[i].length; j++) {
            if(arr[i][j]>max) {
                max = arr[i][j];
            }
        }
       }
       System.out.println(max);
    }
    public static void FindMin() {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
        	for(int j=0; j<arr[0].length; j++) {
        		if(arr[i][j]<min) {
        			min = arr[i][j];
        		}
        	}
        }
        System.out.println();
        System.out.println("Minium value is: "+min);
    }
    public static void FindRowMax() {
        int maxrow[] = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
        	for(int j=0; j<arr[0].length; j++) {
        		if(arr[i][j]>maxrow[i]) {
        			maxrow[i] = arr[i][j];
        		}
        	}
        }
        System.out.println();
        for(int i=0; i<maxrow.length; i++) {
        	System.out.println(maxrow[i]);
        }
    }
    public static void FindRowMin() {
    	int minrow[] = new int[arr.length];
    	for(int i=0; i<arr.length; i++) {
    		minrow[i] = Integer.MAX_VALUE;
    	}
    	for(int i=0; i<arr.length; i++) {
    		for(int j=0; j<arr[0].length; j++) {
    			if(arr[i][j]<minrow[i]) {
    				minrow[i] = arr[i][j];
    			}
    		}
    	}
    	System.out.println();
    	for(int i=0; i<minrow.length; i++) {
    		System.out.println(minrow[i]);
    	}
    }
    public static void FindColumnMax() {
        int[] maxcol = new int[arr.length];
        for(int i=0; i<maxcol.length; i++) {
        	maxcol[i] = Integer.MIN_VALUE;
        }
        for(int i=0; i<arr.length; i++) {
        	for(int j=0; j<arr[i].length; j++) {
        		if(arr[j][i]>maxcol[i]) {
        			maxcol[i] = arr[j][i];
        		}
        	}
        }
        System.out.println();
        for(int i=0; i<maxcol.length; i++) {
        	System.out.println(maxcol[i]);
        }
    }
    public static void FindColumnMin() {
        int[] mincol = new int[arr.length];
        for(int i=0; i<mincol.length; i++) {
        	mincol[i] = Integer.MAX_VALUE;
        }
        for(int i=0; i<arr.length; i++) {
        	for(int j=0; j<arr[i].length; j++) {
        		if(arr[i][j]<mincol[j]) {
        			mincol[j] = arr[i][j];
        		}
        	}
        }
        System.out.println();
        for(int i=0; i<mincol.length; i++) {
        	System.out.println(mincol[i]);
        }
    }
}
