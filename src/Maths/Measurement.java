package Maths;

abstract class  Measurement {
    double length;

    public boolean compare(Measurement unit) {
        length = this.convertToInch();
        double otherLength = unit.convertToInch();
        if(length == otherLength)
            return true;
        else
            return false;
    }

    public double addUnitsToInch(Measurement unit) {
        length = this.convertToInch();
        double otherLength = unit.convertToInch();
        return length + otherLength;
    }

        public abstract double convertToInch();

}

     class Inch extends Measurement {
        public Inch(double length) {
            super.length = length;
        }

        public double convertToInch() {
            return length;
        }
    }

    class Yard extends Measurement {
        public Yard(double length) {
            super.length = length;
        }

        public double convertToInch() {
            return super.length *36;
        }
    }

    class Centimetre extends Measurement {
        public Centimetre(double length) {
            super.length = length;
        }
        public double convertToInch() {
            return length *0.39;
        }
    }

    class Feet extends Measurement {
        public Feet(double length) {
            super.length = length;
        }
        public double convertToInch() {
            return length*12;
        }
    }




