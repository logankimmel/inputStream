File fileIn = new File("badfile.edi")
FileInputStream fis = new FileInputStream(fileIn)
BufferedInputStream bis = new BufferedInputStream(fis)
StringBuffer strb = new StringBuffer()
int fs = fileIn.length()

for(int x = 0;x < fs;x++) { 
	strb.append((char) bis.read())
}

String strOut = strb.toString()
println strOut

File fileOut = new File("badout.edi")
FileOutputStream fos = new FileOutputStream(fileOut)

fos.write(strOut.getBytes())
