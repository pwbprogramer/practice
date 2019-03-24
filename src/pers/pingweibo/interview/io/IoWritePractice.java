package pers.pingweibo.interview.io;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class IoWritePractice {
     
	private File file = null;
	
	public void createFile(String path) throws IOException {
		this.file = new File(path); 
		if(!file.exists()) {
			if(file.createNewFile()) {
				System.out.println("===");
			};
		}
	}
	
	public void writeFileData() {
		if(this.file==null) {
			System.out.println("please create a file");
			return;
		}
		FileOutputStream ops = null;
		try{
			ops = new FileOutputStream(this.file);
			String word = new String("为了石莹，一定要去北京");
			ops.write(word.getBytes("UTF-8"));
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(ops!=null) {
				try {
					ops.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void writeFileBuffer() {
		if(this.file==null) {
			System.out.println("please create a file");
			return;
		}
		FileOutputStream ops = null;
		BufferedOutputStream bos = null;
		try{
			ops = new FileOutputStream(this.file);
			bos = new BufferedOutputStream(ops);
			String word = new String("为了石莹，为了MyGirl，一定要去北京");
			bos.write(word.getBytes("UTF-8"));
			bos.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(bos!=null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(ops!=null) {
				try {
					ops.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
	public void writerFile() {
		if(this.file==null) {
			System.out.println("please create a file");
			return;
		}
		FileWriter fw= null;
		try{
			fw = new FileWriter(file);
			String word = new String("为了my love 石莹，为了MyGirl，一定要去北京");
		    fw.write(word);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void writerBuffer() {
		if(this.file==null) {
			System.out.println("please create a file");
			return;
		}
		FileWriter fw= null;
		BufferedWriter bw = null;
		try{
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			String word = new String("为了my love 石莹，为了MyGirl，不要再次错过我的女孩，一定要去北京");
			bw.write(word);
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(bw!=null) {
				try {
					bw.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
