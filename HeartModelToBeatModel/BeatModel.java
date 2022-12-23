public class BeatModel implements BeatModelInterface, MetaEventListener {

  Sequencer sequencer;
  ArrayList beatObservers = new ArrayList();
  ArrayList bpmObservers = new ArrayList();
  int bpm = 90;

  // other instance variables here
  public void initialize() {
    setUpMidi();
    buildTrackAndStart();
  }

  public void on() {
    sequencer.start();
    setBPM(90);
  }

  public void off() {
    setBPM(0);
    sequencer.stop();
  }

  public void setBPM(int bpm) {
    this.bpm = bpm;
    sequencer.setTempoInBPM(getBPM());
    notifyBPMObservers();
  }

  public int getBPM() {
    return bpm;
  }

  void beatEvent() {
    notifyBeatObservers();
  }
  // Code to register and notify observers

  // Lots of MIDI code to handle the beat
}
