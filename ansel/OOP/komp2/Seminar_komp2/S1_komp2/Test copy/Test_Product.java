public class Test_Product<Doudle> {
    private String name;
    private Double price;
        public Test_Product(String name, Double price){
            this.name = name;
            this.price = price;
                    
            }
            
            public String getName(){
                return name;
        }
        
        public Double getPrice(){
        return price;
        }
        
        @Override
        public String toString(){
        
            return String.format("%s %f \n ", name, price);
            //return String.format("name: %s; price: %2.2f ", name, price);
        } 
}
