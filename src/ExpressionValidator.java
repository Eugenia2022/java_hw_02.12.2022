public class ExpressionValidator {
    public boolean parse(String val){
        try{
            Integer.parseInt(val);
        }catch(NumberFormatException ex){
            return false;
        }

        return true;
    }

    public boolean parse(char[] val){
        try{
            Integer.parseInt("" + val[0]);
        }catch(NumberFormatException ex){
            return false;
        }

        return true;
    }

    public boolean parse(String[] val){
        try{
            Integer.parseInt(val[0]);
        }catch(NumberFormatException ex){
            return false;
        }

        return true;
    }

    public boolean parse(String val1, String val2){
        try{
            Integer.parseInt(val1);
            Integer.parseInt(val2);
        }catch(NumberFormatException ex){
            return false;
        }

        return true;
    }

    public boolean parse(char val){
        try{
            Integer.parseInt("" + val);
        }catch(NumberFormatException ex){
            return false;
        }

        return true;
    }
}
