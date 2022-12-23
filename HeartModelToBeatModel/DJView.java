// public class DJView implements ActionListener, BeatObserver, BPMObserver {
//  BeatModelInterface model;
//  ControllerInterface controller;
//  JFrame viewFrame;
//  JPanel viewPanel;
//  BeatBar beatBar;
//  JLabel bpmOutputLabel;
 
//  public DJView(ControllerInterface controller, BeatModelInterface model) { 
//  this.controller = controller;
//  this.model = model;
//  model.registerObserver((BeatObserver)this);
//  model.registerObserver((BPMObserver)this);
//  }
 
//  public void createView() {
//  // Create all Swing components here
//  }
 
//  public void updateBPM() {
//  int bpm = model.getBPM();
//  if (bpm == 0) {
//  bpmOutputLabel.setText(“offline”);
//  } else {
//  bpmOutputLabel.setText(“Current BPM: “ + model.getBPM());
//  }
//  }
 
//  public void updateBeat() {
//  beatBar.setValue(100);
//  }
// }
public class DJView implements ActionListener, BeatObserver, BPMObserver {
 BeatModelInterface model;
 ControllerInterface controller;
 JLabel bpmLabel;
 JTextField bpmTextField;
 JButton setBPMButton;
 JButton increaseBPMButton;
 JButton decreaseBPMButton;
 JMenuBar menuBar;
 JMenu menu;
 JMenuItem startMenuItem;
 JMenuItem stopMenuItem;
 
 public void createControls() {
 // Create all Swing components here
 }
 public void enableStopMenuItem() {
 stopMenuItem.setEnabled(true);
 }
 public void disableStopMenuItem() {
 stopMenuItem.setEnabled(false);
 }
 public void enableStartMenuItem() {
 startMenuItem.setEnabled(true);
 }
 public void disableStartMenuItem() {
 startMenuItem.setEnabled(false);
 }
 public void actionPerformed(ActionEvent event) {
 if (event.getSource() == setBPMButton) {
 int bpm = Integer.parseInt(bpmTextField.getText());
 controller.setBPM(bpm);
 } else if (event.getSource() == increaseBPMButton) {
 controller.increaseBPM();
 } else if (event.getSource() == decreaseBPMButton) {
 controller.decreaseBPM();
 }
 }
}