
SUMMARY = "Internationalized Domain Names in Applications (IDNA)"
HOMEPAGE = "https://github.com/kjd/idna"
AUTHOR = "Kim Davies <kim@cynosure.com.au>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=cf36c8682cc154d2d4aa57bd6246b9a1"

SRC_URI = "https://files.pythonhosted.org/packages/cb/19/57503b5de719ee45e83472f339f617b0c01ad75cba44aba1e4c97c2b0abd/idna-2.9.tar.gz"
SRC_URI[md5sum] = "870b8b80267f00f0faf1b7ba4bdbf14e"
SRC_URI[sha256sum] = "7588d1c14ae4c77d74036e8c22ff447b26d0fde8f007354fd48a7814db15b7cb"

S = "${WORKDIR}/idna-2.9"

RDEPENDS_${PN} = ""

inherit setuptools3
