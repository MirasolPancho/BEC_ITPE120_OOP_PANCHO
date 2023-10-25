class Colors{
    public enum CustomColor{
        RED(200,0,0),
        GREEN(0,200,0),
        BLUE(0,0,200),
        YELLOW(200,200,0),
        BLACK(0,0,0),
        WHITE(200,200,200);

        private int red;
        private int green;
        private int blue;

        CustomColor(int red, int green, int blue){
            this.red = red;
            this.green = green;
            this.blue = blue;
        }
        public void displayRGB(){
            System.out.println(name()+"-Red: "+red+",Green: "+green+",Blue: "+blue);
        }
        public static void main(String[] args){
            CustomColor[] color = CustomColor.values();            
            CustomColor.RED.displayRGB();
            CustomColor.GREEN.displayRGB();
            CustomColor.BLUE.displayRGB();
            CustomColor.YELLOW.displayRGB();
            CustomColor.BLACK.displayRGB();
            CustomColor.WHITE.displayRGB();
            System.out.println();
            for (CustomColor colors: color){
                colors.displayRGB();

            }

        }
    }
}