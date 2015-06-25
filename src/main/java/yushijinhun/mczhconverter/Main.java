package yushijinhun.mczhconverter;

import yushijinhun.mczhconverter.ui.WindowOpenLevel;

public class Main {

	public static void main(String[] args) throws Exception {
                if(args.length!=0)
                    new WindowOpenLevel(args[0]).setVisible(true);
                else
                    new WindowOpenLevel(null).setVisible(true);
	}
}
