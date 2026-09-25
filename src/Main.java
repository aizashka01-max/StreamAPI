void main(String[] args) {
    //Classic style, if i want replace in lambda press Win: alt+enter, for mac: option + enter
    CAlcutale calc2 = new CAlcutale() {
        @Override
        public int add(int a, int b) {
            return a+b;
        }
    };
     int result2 = calc2.add(1,2);
     System.out.println(result2);

//Stream API
  CAlcutale calc = (a, b) -> a+b;
  int result = calc.add(1,2);
    System.out.println(result);

    CAlcutale calc3 = (a, b) ->
    {
        System.out.println("result add " + (a+b));
        return a+b;
    };
    calc3.add(3,1);

    Flyeble airplane = () -> {
        System.out.println("Airplane is flying");
        System.out.println("airplane is jumping");
        System.out.println("airplane be happy");
    };
    airplane.fly();
//Проверка ан возраст Predicate
    Predicate<Integer> isAdult2 = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            return integer>17;
        }
    };
    boolean result5 = isAdult2.test(30);
    System.out.println(result5);


    Predicate<Integer> isAdult = (age) -> age > 17;
    boolean result4 = isAdult.test(30);
    System.out.println(result4);

// покупка напитка в автомате Function
    Function<Integer, String> automate = (money) -> {
        if(money == 2){
            return "cola";
        } else if (money == 3) {
            return "sprite";

        } else {
            return "You don't have money";
        }
    };
    System.out.println(automate.apply(3));

    //Костер Consumer
Consumer<String> fire = (item) ->
{
    if(item.equals("дрова")){
        System.out.println("Горит долго");
    } else if (item.equals("береза")) {
        System.out.println("горит ярко");
    } else {
        System.out.println("Скудно горит");
    }
};
   fire.accept("дрова");
//получение талоны в очереди Supplier
   Supplier<Integer> talon = () -> new Random().nextInt(100);
    System.out.println(talon.get());

    //Comparator ширенга на физре по высоте

}


