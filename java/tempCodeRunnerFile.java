
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
    
                int n = sc.nextInt();
                int r = sc.nextInt();
    
               int ans =permutation(n,r);
               System.out.println(ans);
               sc.close();
            }
        }