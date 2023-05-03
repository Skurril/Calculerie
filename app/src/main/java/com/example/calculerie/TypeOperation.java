package com.example.calculerie;

public enum TypeOperation {
        ADD(" + "),
        MULTIPLY("  "),
        SUBSTRACT(" - "),
        DIVIDE(" / ");

        private  String symbol;

        TypeOperation(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }
}

