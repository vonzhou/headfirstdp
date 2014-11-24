package decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream{

	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	// �ַ���ȡ
	@Override
	public int read() throws IOException {
		int c = super.read();
		return (c==-1)?c:Character.toLowerCase(c);
	}
	
	// �����ƶ�ȡ
	@Override
	public int read(byte[] b, int offset, int len) throws IOException {
		// ���سɹ���ȡ�ĸ���
		int res =  super.read(b, offset, len);
		for(int i=offset; i<offset+res;i++){
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return res;
	}

}
