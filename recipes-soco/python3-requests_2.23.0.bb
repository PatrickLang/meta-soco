
SUMMARY = "Python HTTP for Humans."
HOMEPAGE = "https://requests.readthedocs.io"
AUTHOR = "Kenneth Reitz <me@kennethreitz.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=19b6be66ed463d93fa88c29f7860bcd7"

SRC_URI = "https://files.pythonhosted.org/packages/f5/4f/280162d4bd4d8aad241a21aecff7a6e46891b905a4341e7ab549ebaf7915/requests-2.23.0.tar.gz"
SRC_URI[md5sum] = "abfdc28db1065bbd0bc32592ac9d27a6"
SRC_URI[sha256sum] = "b3f43d496c6daba4493e7c431722aeb7dbc6288f52a6e04e7b6023b0247817e6"

S = "${WORKDIR}/requests-2.23.0"

RDEPENDS_${PN} = "python3-chardet python3-idna python3-urllib3 python3-certifi"

inherit setuptools3
