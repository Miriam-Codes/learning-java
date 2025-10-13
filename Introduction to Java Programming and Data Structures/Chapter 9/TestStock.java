public class TestStock {
    public static void main(String[] args) {
        Stock s1 = new Stock("ORCL", "Oracle Corporation");
        s1.setPreviousClosingPrice(34.5);
        s1.setCurrentPrice(34.35);
        System.out.printf(
                "Name: %s\nSymbol: %s\nPrevious Closing Price: %.2f\nCurrent Price: %.2f\nPercentage Change: %.2f%%\n\n",
                s1.getName(), s1.getSymbol(), s1.getPreviousClosingPrice(), s1.getCurrentPrice(),
                s1.getChangePercent());
    }

}
