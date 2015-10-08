/**
 * Project:
 * Class:
 * Created by Meesh
 * 10/5/15
 */

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class HelloWorld {
    public static void main(String[] args){
        Player player = new Player();

        Pattern p1 = new Pattern("A#4h+Rq_E#5q C#6h+Rq_E#5i_A#4i | C6h+Rq_D#5q A#5h+Rq_C#5q")
                .setVoice(0)
                .setTempo(125)
                .setInstrument("Piano");

        Pattern p2 = new Pattern("G#4h+Rq_D#5q B#5h+Rq_D#5i_G#4i | A#5h+Rq_C5q G#5h+Rq_B#4q")
                .setVoice(0)
                .setTempo(125)
                .setInstrument("Piano");

        Pattern vocals = new Pattern("A#4h+Rq_B#4i_E#5i")
                .setVoice(1)
                .setTempo(125)
                .setInstrument("Guitar");

        Pattern p3 = new Pattern(p1, p2);

        Pattern p4 = new Pattern("C#5h+Rq_G#5q E#6h+Rq_G#5i_C#5i | D#6h+Rq_E#5q C#6h+Rq_C#5q")
                .setVoice(0)
                .setTempo(125)
                .setInstrument("Piano");

        Pattern p5 = new Pattern("B4h+Rq_F#5q D#6h+Rq_F#5i_B4i | C#6h+Rq_D#5q B5h+Rq_B4q")
                .setVoice(0)
                .setTempo(125)
                .setInstrument("Piano");

        Pattern p6 = new Pattern(p4, p5);

        player.play(p1.repeat(2), p3.repeat(2), p6.repeat(2));
    }
}


/*

Experimentation - E minor
Pattern p1 = new Pattern("Eminw | Bminw | Eminw | Aminw").setVoice(0).setInstrument("Piano");
Pattern p2 = new Pattern("Rq E5 D#5q E5q | F#5q E5h.| F#5q E5h E5q| G5h F#5h").setVoice(1).setInstrument("Xylophone");
Pattern p3 = new Pattern("Rq B5q A5q G5q | A5q G5q F#5q D#5q | E5q E5q Rq G5q | F#5h E5h").setVoice(1).setInstrument("Xylophone");
Pattern p4 = new Pattern("Ri E4i E4i E4i Ri Ri Ri Ri | E4i E4i E4i E4i F#4i F#4i F#4i F#4i ").setVoice(2).setInstrument("Acoustic_Bass");
player.play(p1, p2, p1, p2, p1, p3, p1, p2);
player.play(p1, p2, p4, p1, p2, p4, p1, p3, p4, p1, p2, p4);

Pattern p1 = new Pattern("Eminw | Bminw | Eminw | Aminw").setVoice(0).setInstrument("Piano");
        Pattern p2 = new Pattern("E4w | B4w | E4w | A4w").setVoice(1).setInstrument("Violin");
        Rhythm rhythm = new Rhythm()
                .addLayer("O...X...O...X...")
                .addLayer("....S.......S...")
                .addLayer(".```.`.`.```.`.`")
                .addLayer("...............+");

        player.play(rhythm.getPattern().repeat(4), p1.repeat(2), p2);v

Wasn't Me
player.play("T140 Rq E5i E5i E5i D5i D5i D5i | D5i D5i G5q E5q D5q | D5i D5i D5i D5i D5q C5q | G4w");
player.play("T140 Rq E5i E5i E5q D5i D5i | D5q G5q E5q D5q | D5i D5i D5i D5i D5q C5q | G4h E4q F4q");
player.play("T140 G4h C5q B4q | A4q A4q G4q F4q | E4q E4i E4i E4q E4q | D4h E4q F4q");
player.play("T140 G4h C5q B4q | A4q A4q G4q F4q | E4i E4i E4i E4i E4q E4q | D4w");
player.play("T140 Rq C5i C5i C5i C5i C5i C5i | D5q E5q Rq C4i C4i | C4q C5i C5i C5q C5i C5i | D5q E5q Rq C4i C4i");
player.play("T140 Ri C4i E5i E5i E5i D5i D5q | D5q C5q Rq C4i C4i | C4i E5i E5i E5i E5i E5i E5q | G5q G5q ");
player.play("T140 Rq E5i E5i E5i D5i D5i D5i | D5i D5i G5q E5q D5q | D5i D5i D5i D5i D5q C5q | G4w");
player.play("T140 Rq E5i E5i E5q D5i D5i | D5q G5q E5q D5q | D5i D5i D5i D5i D5q C5q | G4h E4q F4q");
player.play("T140 G4h C5q B4q | A4q A4q G4q F4q | E4q E4i E4i E4q E4q | D4h E4q F4q");
player.play("T140 G4h C5q B4q | A4q A4q G4q F4q | E4i E4i E4i E4i E4q E4q | D4w");

Rain
Pattern p1 = new Pattern("C5q D5q D#5q F5q | G5h D#5h | F5h D5h | C5w | Rw | Rw | Rw | Rw")
                .setVoice(0)
                .setTempo(130)
                .setInstrument("Piano");

        Pattern p2 = new Pattern("C3q G3q C4q G3q | C4q G3q D#3q G3q")
                .setVoice(1)
                .setTempo(130)
                .setInstrument("Piano")
                .repeat(4);

        Pattern p3 = new Pattern("C5q D5q D#5q F5q | G5h D#5h | F5h G#5h | G5h D#5h | C5w")
                .setVoice(0)
                .setTempo(130)
                .setInstrument("Piano");

        player.play(p1, p2, p3);

Super Mario Theme
player.play("T160 E5i E5q E5q C5i E5q | G5h G4h ");
player.play("T160 C5i. G4i. E4q | ");

Sweet Child of Mine
player.play("T210 I[Distortion_Guitar] D5q A5q G5q F#5q | F#6q F#5q D6q F#5q | D5q A5q G5q F#5q | F#6q F#5q D6q F#5q");
player.play("T210 I[Distortion_Guitar] E5q A5q G5q F#5q | F#6q F#5q D6q F#5q | E5q A5q G5q F#5q | F#6q F#5q D6q F#5q");
player.play("T210 I[Distortion_Guitar] D5q A5q G5q F#5q | F#6q F#5q D6q F#5q | D5q A5q G5q F#5q | F#6q F#5q D6q F#5q");
player.play("T210 I[Distortion_Guitar] E5q A5q G5q F#5q | F#6q F#5q D6q F#5q | E5q A5q G5q F#5q | F#6q F#5q D6q F#5q");

Call Me Maybe
player.play("Rh G5h | B4q D5q G5q D5q");
player.play("Rh. D5q | B4q D5q B5q G5q ");
player.play("Rh. G5q | B5q C6q B5q G5q ");
player.play("Rh. G5q | B5q A5q A5q G5q ");

Crazy Train
player.play("G3q G3h. | A#3q A#3q F3q F3q");
player.play("G3q G3h. | D#4q D#4q F3q F3q");

Ode To Joy
player.play("Eq Eq Fq Gq | Gq Fq Eq Dq | Cq Cq Dq Eq | Eq  Dq Dh");
player.play("Eq Eq Fq Gq | Gq Fq Eq Dq | Cq Cq Dq Eq | Dq Cq Ch");

*/