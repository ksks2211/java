# __java.io__

## [Byte Stream](./bytestream "Byte Stream")

- InputStream, OutputStream
- FileInputStream, FileOutputStream
- ByteArrayInputStream, ByteArrayOutputStream
- SequenceInputStream
- BufferedInputStream, BufferedOutputStream
- DataInputStream, DataOutputStream
- PrintStream

## [Char Stream](./charstream "char Stream")
- Writer, Reader
- FileWriter, FileReader
- InputStreamReader, OutputStreamReader
- PrintWriter
- StringWriter, StringReader
- BufferedWriter, BufferedReader

## [Serializable](./serialization "serialization")
- Serializable
- ObjectOutputStream, ObjectInputStream
- writeObject, readObject

## [Standard I/O](./stdio "stdio")
- Console
- Scanner
- System.in, System.out, System.err

## [FILE](./file "file")
- File
  - 파일을 나타내는 클래스
  - 디렉토리명, 유효하지 않은 문자열도 컴파일 에러나 예외 발생하지 않음
  - 출력스트림을 생성하거나, createNewFile() 메서드를 호출해야 실제 파일이나 디렉토리 생성
- FileDescriptor
- RandomAccessFile

