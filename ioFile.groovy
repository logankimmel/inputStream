File fileIn = new File("badfile.edi")

FileInputStream fis = new FileInputStream(fileIn)
BufferedInputStream bis = new BufferedInputStream(fis)

def bucket = []

int fs = fileIn.length()
File fileOut = new File("badout.edi")
FileOutputStream fos = new FileOutputStream(fileOut)

for(int x = 0;x < fs;x++) { 
	bucket.add((char) bis.read())
}

fos.write(bucket as byte[])
