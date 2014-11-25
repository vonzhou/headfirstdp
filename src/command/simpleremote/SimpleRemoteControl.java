package command.simpleremote;

//
// This is the invoker
//
public class SimpleRemoteControl {
	Command slot;// Ò»¸ö²å²Û
 
	public SimpleRemoteControl() {}
 
	public void setCommand(Command command) {
		slot = command;
	}
 
	public void buttonWasPressed() {
		slot.execute();
	}
}
