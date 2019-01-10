//classwork

public class DrumKitTestDrive {
	public static void main(String[] args) {
		Drumkit d = new DrumKit();
		d.playSnare();
		d.snare=false;
		if(d.snare==true){
			d.snare();
		}
		d.playTopHat();
		}
	}
