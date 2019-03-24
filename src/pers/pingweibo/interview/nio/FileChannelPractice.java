package pers.pingweibo.interview.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public class FileChannelPractice {
	
	
	private File file = null;
	
	
	public void createFile(String pathname) throws IOException {
		this.file = new File(pathname);
		if(!this.file.exists()) {
			this.file.createNewFile();
		}
	}
	
	private boolean fileExists() {
		if(this.file==null) {
			System.out.println("please create a file");
			return false;
		}else {
			return true;
		}
	}
	
	/**
	 * FileChannel 读
	 */
	public void readFileChannel() {
		if(!this.fileExists()) {
			return;
		}
		FileInputStream fis = null;
		FileChannel fileChannel = null;
		try {
			 fis = new FileInputStream(this.file);
			 fileChannel = fis.getChannel();
			 ByteBuffer byteB = ByteBuffer.allocate(1024);
			 int length = fileChannel.read(byteB);
			 while(length!=-1) {
				 byteB.flip();
				 List<Byte> list = new ArrayList<>();
				 while(byteB.hasRemaining()) {
					 list.add(byteB.get());
				 };
				 byte[] temp = new byte[list.size()];
				 for(int i=0;i<list.size();i++) {
					 temp[i] = list.get(i);
				 }
				 System.out.println(new String(temp,"UTF-8"));
				 byteB.clear();
				 length = fileChannel.read(byteB);
			 }
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fileChannel!=null) {
				try {
					fileChannel.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * FileChannel 写
	 */
	public void writeFileChannel() {
		if(!this.fileExists()) {
			return;
		}
		FileOutputStream fos = null;
		FileChannel fileChannel = null;
		try {
			fos = new FileOutputStream(this.file);
			fileChannel = fos.getChannel();
			String life = "life is always difficult ";
			ByteBuffer buffer = ByteBuffer.wrap(life.getBytes("UTF-8"));
			fileChannel.write(buffer);
			buffer.clear();
			buffer.put(new String("but i never give up").getBytes("UTF-8"));
			buffer.flip();
			fileChannel.write(buffer);
			buffer.clear();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fileChannel!=null) {
				try {
					fileChannel.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
