package util;

import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;

/**
 * Created by WZ on 2016/8/29 0029.
 */
public class NettyUtil {
    public static <T> void setAttribute(ChannelHandlerContext ctx, String key, T value) {
        AttributeKey<T> attrKey = AttributeKey.valueOf(key);
        ctx.channel().attr(attrKey).set(value);
    }

    public static <T> T getAttribute(ChannelHandlerContext ctx, String key) {
        AttributeKey<T> attrKey = AttributeKey.valueOf(key);
        return ctx.channel().attr(attrKey).get();
    }

}
