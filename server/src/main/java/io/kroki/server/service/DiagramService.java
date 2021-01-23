package io.kroki.server.service;

import io.kroki.server.decode.SourceDecoder;
import io.kroki.server.format.FileFormat;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;

import java.util.List;

public interface DiagramService {

  List<FileFormat> getSupportedFormats();

  SourceDecoder getSourceDecoder();

  String getVersion();

  void convert(String sourceDecoded, String serviceName, FileFormat fileFormat, Handler<AsyncResult<Buffer>> handler);
}
