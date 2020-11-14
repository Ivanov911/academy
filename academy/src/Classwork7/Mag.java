package Classwork7;


	import java.util.Scanner;
	 
	 
	 
	class ProductItem{
		
	    public static final String[] PRODUCTS = new String[]{"����", "������", "������"};
	    public static final int[] PRICES = new int[]{100, 200, 300};
	 
	    private int count;
	    private int position;
	    
	    public ProductItem(int position, int count){
	        this.position = position;
	        this.count = count;
	    }
	    
	    public String getInfo(){
	        StringBuilder sb = new StringBuilder();
	        sb.append(PRODUCTS[this.position]+" �� ���� "+ PRICES[this.position]+" �� ��. = "+PRICES[this.position]*this.count+" �.");
	        return sb.toString();
	    }
	    
	    public int getSumm(){
	        return PRICES[this.position]*this.count;
	    } 
	}
	class Main {
	    public static final int MAX_CAPACITY = 10;
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String input;
	        
	        ProductItem[] busket = new ProductItem[MAX_CAPACITY];
	        int busketSize = 0;
	 
	        System.out.println("������ ��������� ������� ��� �������");
	        for(int i=1; i <= ProductItem.PRODUCTS.length; i++){
	            System.out.println(i+". "+ProductItem.PRODUCTS[i-1]+"("+ProductItem.PRICES[i-1]+" �.)");        
	        }        
	        
	        int productNumber = 0;
	        int productCount = 0;
	        int totalPrice = 0;
	        
	        
	        do{
	            System.out.println("�������� ����� � ������� ���������� ��� ������� `end`");
	            input = scanner.nextLine();
	            if("end".equals(input)){
	                break;
	            }
	            try{
	                String[] item = input.split(" ");
	                productNumber = Integer.parseInt(item[0])-1;
	                productCount = Math.abs(Integer.parseInt(item[1]));
	                if(productNumber>=ProductItem.PRODUCTS.length ||productNumber<0){
	                    throw new ArrayIndexOutOfBoundsException("������ � ����� ����� �� ����������");
	                }
	                busket[busketSize]=new ProductItem(productNumber, productCount);
	                busketSize++;
	                System.out.println("����� �������� � ���� �������");
	            }
	            catch(ArrayIndexOutOfBoundsException e){
	                System.out.println("������ � ����� ����� �� ����������");
	            }
	            catch(RuntimeException ex){
	                System.out.println("������� � ���� ������ ����� �� ������ ������� � ��������� ����������");
	                continue;
	            }          
	        }while(true && busketSize<MAX_CAPACITY);
	        
	        System.out.println((busketSize>0)?"� ������� ����� ��������� ������":"� ������� ��� �������");
	        for(int itemCount = 0; itemCount<busketSize;itemCount++){
	            System.out.println(busket[itemCount].getInfo());
	            totalPrice += busket[itemCount].getSumm();
	        }
	        System.out.printf("\t\t\t\t\t\t\t�����: %7d �. \n", totalPrice);
	    }   
	}

