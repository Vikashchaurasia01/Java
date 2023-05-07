// Write a program to show an example of multiple inheritance which extends and implements at the same time.

class Phone{
     void call(){
        System.out.println("Phone Call");
     }
     void sms(){
        System.out.println("send SMS");
     }
}

interface camera{
    void shoot();
    void delPic();
}

interface musicPlayer{
    void play();
    void pause();
    void stop();
}

class SmartPhone extends Phone implements camera,musicPlayer{
    SmartPhone(){
        System.out.println("This is my smart phone");
    }
    public void shoot(){
        System.out.println("shooting pictures");
    }
    public void delPic(){
        System.out.println("deleting pictures");
    }
    public void play(){
        System.out.println("playing music");
    }
    public void pause(){
        System.out.println("pausing music");
    }    
    public void stop(){
        System.out.println("stopping music");
    }
}


public class InheritMultiple{
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        Phone p = s;
        s.call();
        camera c = s;
        c.shoot();
        musicPlayer m = s;
        m.play();
    }
}