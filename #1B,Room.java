class Room {
    private int length;
    private int width;

    public Room(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int calculateArea() {
        return length * width;
    }
}
class ReuseExample {
    public static void main(String[] args) {
        Room myRoom = new Room(10, 8);
        int area = myRoom.calculateArea();
        System.out.println("The area of the room is: " + area + " square units");//80
    }
}
