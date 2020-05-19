
SUMMARY = "Universal encoding detector for Python 2 and 3"
HOMEPAGE = "https://github.com/chardet/chardet"
AUTHOR = "Daniel Blanchard <dan.blanchard@gmail.com>"
LICENSE = "LGPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6f89e2100d9b6cdffcea4f398e37343"

SRC_URI = "https://files.pythonhosted.org/packages/fc/bb/a5768c230f9ddb03acc9ef3f0d4a3cf93462473795d18e9535498c8f929d/chardet-3.0.4.tar.gz"
SRC_URI[md5sum] = "7dd1ba7f9c77e32351b0a0cfacf4055c"
SRC_URI[sha256sum] = "84ab92ed1c4d4f16916e05906b6b75a6c0fb5db821cc65e70cbd64a3e2a5eaae"

S = "${WORKDIR}/chardet-3.0.4"

RDEPENDS_${PN} = ""

inherit setuptools3
