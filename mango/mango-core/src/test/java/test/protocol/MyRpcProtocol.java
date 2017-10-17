package test.protocol;

import mango.common.URL;
import mango.protocol.AbstractProtocol;
import mango.rpc.Exporter;
import mango.rpc.Provider;
import mango.rpc.Reference;

public class MyRpcProtocol extends AbstractProtocol{

	@Override
	public void destroy() {
		System.out.println("myrpcProtocol destroy...");
	}

	@Override
	protected <T> Reference<T> createReference(Class<T> clz, URL url, URL serviceUrl) {
		return null;
	}

	@Override
	protected <T> Exporter<T> createExporter(Provider<T> provider, URL url) {
		return null;
	}

}
