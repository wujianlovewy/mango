package test.extension;

import mango.core.extension.ExtensionLoader;
import mango.rpc.Protocol;

public class TestExtensionLoader {

	public static void main(String[] args) {
		ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("myprotocol").destroy();
		ExtensionLoader.getExtensionLoader(Protocol.class).getDefaultExtension().destroy();
	}
	
}
