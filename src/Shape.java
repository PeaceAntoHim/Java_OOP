class Shape {

    int getCorner() {
        return 0;
    }

}

class Rectangle extends Shape {

    int getCorner() {
        super.getCorner();
        return 4;
    }

    // This super keyword to access parent class
    int getParentCorner() {
        return super.getCorner();
    }
}
