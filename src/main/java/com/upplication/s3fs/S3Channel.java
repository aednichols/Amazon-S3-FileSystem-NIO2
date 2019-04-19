
package com.upplication.s3fs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

abstract class S3Channel {
    /**
     * Create a temporary place for the S3 file on the local filesystem, with the s3 filename mixed in
     * e.g. "/tmp/script-tempSuffix"
     * @param path S3 path to create a file for
     * @return Path on the local filesystem to the temporary file that was created
     */
    static Path createTempFile(S3Path path) throws IOException {
        return Files.createTempFile(path.getFileName().toString(), "");
    }
}
