package com.pb.konnov.hw7;

public enum Size {
            XXS,
            XS,
            S,
            M,
            L;

    private String description;
    private String euroSize;

    private Size() {
        this.euroSize = euroSize;
        this.description = description;
        }


    static String getDescription (String description) {
        String temp = new String();
        if (description.equals(String.valueOf(Size.XXS))) {
        temp = "Дествкий размер";
        }
        if (description.equals(String.valueOf(Size.XS)) || description.equals(String.valueOf(Size.S)) || description.equals(String.valueOf(Size.M)) || description.equals(String.valueOf(Size.L))) {
            temp = "Взрослый размер";
        }
        return temp;
        }
        static int getEuroSize(String euroSize) {
            int euro = 0;
            switch (euroSize) {
                case "XXS":
                    euro=32;
                    break;
                case "XS":
                    euro=34;
                    break;
                case "S":
                    euro=36;
                    break;
                case "M":
                    euro=38;
                    break;
                case "L":
                    euro=40;
                    break;
            }
            return euro;
        }
    }


