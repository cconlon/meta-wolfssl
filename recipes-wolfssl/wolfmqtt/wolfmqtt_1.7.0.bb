SUMMARY = "wolfMQTT Client Library"
DESCRIPTION = "wolfMQTT is a client library implementation of the MQTT \
               protocol, written in ANSI C and targeted for embedded, RTOS, \
               and resource-constrained environments. It has been built from \
               the ground up to be multi-platform, space conscious, and \
               extensible. It includes support for the MQTT v5.0 protocol."
HOMEPAGE = "https://www.wolfssl.com/products/wolfmqtt"
BUGTRACKER = "https://github.com/wolfssl/wolfmqtt/issues"
SECTION = "libs"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c1c00f9d3ed9e24fa69b932b7e7aff2"

DEPENDS += "wolfssl"

SRC_URI[md5sum] = "fee7d3405d1a4c99ede9a89662aec248"
SRC_URI[sha256sum] = "ddb0630f75f1ab12af6512196690e7c75c0ce6c390457f1f8409734aa36d0bef"
SRC_URI = "https://www.wolfssl.com/wolfmqtt-${PV}.zip \
           file://0001-fix-have-wolfssl-m4-rule.patch"

inherit autotools
