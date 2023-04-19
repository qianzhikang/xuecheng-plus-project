import io.minio.MinioClient;
import io.minio.UploadObjectArgs;
import io.minio.errors.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @Description TODO
 * @Date 2023-04-18-09-39
 * @Author qianzhikang
 */
public class TestMinio {

    MinioClient minioClient =
            MinioClient.builder()
                    .endpoint("http://8.130.88.119:9000")
                    .credentials("minioadmin", "minioadmin")
                    .build();

    @Test
    public void test_upload() throws IOException, ServerException, InsufficientDataException, ErrorResponseException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {

        UploadObjectArgs testbucket = UploadObjectArgs.builder()
                .bucket("testbucket")
                .filename("/Users/qianzhikang/Movies/下载视频/写作技法-许莫淇/参考文献的编号和引用及自动更新.mp4")
                .object("1.mp4")
                .build();
        minioClient.uploadObject(testbucket);

    }
}
