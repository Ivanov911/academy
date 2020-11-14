package Classwork7;


	import java.util.Scanner;
	 
	 
	 
	class ProductItem{
		
	    public static final String[] PRODUCTS = new String[]{"Хлеб", "Яблоки", "Молоко"};
	    public static final int[] PRICES = new int[]{100, 200, 300};
	 
	    private int count;
	    private int position;
	    
	    public ProductItem(int position, int count){
	        this.position = position;
	        this.count = count;
	    }
	    
	    public String getInfo(){
	        StringBuilder sb = new StringBuilder();
	        sb.append(PRODUCTS[this.position]+" по цене "+ PRICES[this.position]+" за шт. = "+PRICES[this.position]*this.count+" р.");
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
	 
	        System.out.println("Список возможных товаров для покупки");
	        for(int i=1; i <= ProductItem.PRODUCTS.length; i++){
	            System.out.println(i+". "+ProductItem.PRODUCTS[i-1]+"("+ProductItem.PRICES[i-1]+" р.)");        
	        }        
	        
	        int productNumber = 0;
	        int productCount = 0;
	        int totalPrice = 0;
	        
	        
	        do{
	            System.out.println("Выберите товар и введите количество или введите `end`");
	            input = scanner.nextLine();
	            if("end".equals(input)){
	                break;
	            }
	            try{
	                String[] item = input.split(" ");
	                productNumber = Integer.parseInt(item[0])-1;
	                productCount = Math.abs(Integer.parseInt(item[1]));
	                if(productNumber>=ProductItem.PRODUCTS.length ||productNumber<0){
	                    throw new ArrayIndexOutOfBoundsException("Товара с таким кодом не существует");
	                }
	                busket[busketSize]=new ProductItem(productNumber, productCount);
	                busketSize++;
	                System.out.println("Товар добавлен в вашу корзину");
	            }
	            catch(ArrayIndexOutOfBoundsException e){
	                System.out.println("Товара с таким кодом не существует");
	            }
	            catch(RuntimeException ex){
	                System.out.println("Вводите в одну строку номер из списка товаров и требуемое количество");
	                continue;
	            }          
	        }while(true && busketSize<MAX_CAPACITY);
	        
	        System.out.println((busketSize>0)?"В корзине лежат следующие товары":"В корзине нет товаров");
	        for(int itemCount = 0; itemCount<busketSize;itemCount++){
	            System.out.println(busket[itemCount].getInfo());
	            totalPrice += busket[itemCount].getSumm();
	        }
	        System.out.printf("\t\t\t\t\t\t\tИтого: %7d р. \n", totalPrice);
	    }   
	}

