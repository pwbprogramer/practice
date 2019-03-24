package pers.pingweibo.interview.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IoReadPractice {
	
	private File file = null;
	
	
	public void createFile(String path) throws IOException {
		this.file = new File(path);
		if(!file.exists()) {
			System.out.println("===");
			file.createNewFile();
		}
	}
	
	/**
	 * 字节流
	 * @throws Exception 
	 */
	public void readFile(){
		if(this.file==null) {
			System.out.println("please create a file");
			return;
		}
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(this.file);
			byte[] readByte = new byte[1024];
			int length;
			String readContent = "";
	        while((length=fis.read(readByte))!=-1) {
	        	readContent += new String(readByte, "utf-8");
	        }
	        System.out.println(readContent);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 字节流+缓冲流
	 */
	public void readBufferFile() {
		if(this.file==null) {
			System.out.println("please create a file");
			return;
		}
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(this.file);
			bis = new BufferedInputStream(fis);
			byte[] temp = new byte[1024];
			int length;
			String readContent = "";
			while((length=bis.read(temp))!=-1) {
				readContent += new String(temp, "utf-8");
			}
			System.out.println(readContent);
		} catch(Exception e){
			e.printStackTrace();
		}finally {
			if(bis!=null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 字符流
	 */
	public void readFileChar() {
		if(this.file==null) {
			System.out.println("please create a file");
			return;
		}
		
		FileReader fr = null;
		try {
			fr = new FileReader(this.file);
			char[] temp = new char[1024];
			int length;
			String readContent = "";
			while((length=fr.read(temp))!=-1) {
				readContent += new String(temp);
			}
			System.out.println(readContent);
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			if(fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 字符流+缓冲流
	 */
	public void readBufferFileChar() {
		if(this.file==null) {
			System.out.println("please create a file");
			return;
		}
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(this.file);
			br = new BufferedReader(fr);
//			char[] temp = new char[1024];
			int length;
			String readContent = "";
//			while((length=br.read(temp))!=-1) {
//				readContent += new String(temp);
//			}
			while((readContent=br.readLine())!=null) {
				System.out.println(readContent);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 读对象流
	 */
	public void readFileObject() {
		if(this.file==null) {
			System.out.println("please create a file");
			return;
		}
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(this.file));
            Object ob = ois.readObject();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(ois!=null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
