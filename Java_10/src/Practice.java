// Practice
// 아래 Device 추상클래스를 이용하여
// UsbPort1 클래스와 WiFi 클래스를 자유롭게 구현해보세요.

// 추상클래스를 그대로 인스턴스를 하게되면 안된다.
// 추상클래스는 구현체라고 생각하면 된다.
abstract class Device {
    int deviceId;

    abstract void deviceInfo();
    abstract void connect();
    abstract void disconnect();
    abstract void send();
    abstract void receive();
}

// UsbPort1 클래스
class UsbPort1 extends Device {
    UsbPort1(int id) {
        this.deviceId = id;
    }

    void deviceInfo() {
        System.out.println("id = " + this.deviceId);
    }
    void connect() {
        System.out.println("연결 하였습니다.");
    }
    void disconnect() {
        System.out.println("연결이 해제되었습니다.");
    }
    void send() {
        System.out.println("데이터를 전송합니다.");
    }
    void receive() {
        System.out.println("데이터를 수신합니다.");
    }
}

// WiFi 클래스
class WiFi extends Device {
//  생성자만 직접 작성을 해주고 나머지는 자동완성으로 구현을 했다.
//   우 클릭을 하고나서 -> Generate -> implement method
    public WiFi(int id) {
        this.deviceId = id;
    }

    void deviceInfo() {

    }

    void connect() {

    }

    void disconnect() {

    }

    void send() {

    }

    void receive() {

    }
}

public class Practice {

    public static void main(String[] args) {
        // Test code
        UsbPort1 usb1 = new UsbPort1(1);
        WiFi wifi = new WiFi(0);
    }

}
