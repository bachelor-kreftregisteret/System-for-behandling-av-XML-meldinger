---
title: OpenAPI definition v0
language_tabs:
  - shell: Shell
  - http: HTTP
  - javascript: JavaScript
  - ruby: Ruby
  - python: Python
  - php: PHP
  - java: Java
  - go: Go
toc_footers: []
includes: []
search: true
highlight_theme: darkula
headingLevel: 2

---

<!-- Generator: Widdershins v4.0.1 -->

<h1 id="openapi-definition">OpenAPI definition v0</h1>

> Scroll down for code samples, example requests and responses. Select a language for code samples from the tabs above or the mobile navigation menu.

Base URLs:

* <a href="http://localhost:8080">http://localhost:8080</a>

<h1 id="openapi-definition-melding">Melding</h1>

Endepunkt for behandling av meldinger

## getAllMeldinger

<a id="opIdgetAllMeldinger"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/api/v1/meldinger \
  -H 'Accept: application/json'

```

```http
GET http://localhost:8080/api/v1/meldinger HTTP/1.1
Host: localhost:8080
Accept: application/json

```

```javascript

const headers = {
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/v1/meldinger',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => 'application/json'
}

result = RestClient.get 'http://localhost:8080/api/v1/meldinger',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': 'application/json'
}

r = requests.get('http://localhost:8080/api/v1/meldinger', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/api/v1/meldinger', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/v1/meldinger");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/api/v1/meldinger", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /api/v1/meldinger`

*Returnerer alle meldinger*

Returnerer alle gyldige eller tilgjengelige meldinger

> Example responses

<h3 id="getallmeldinger-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Success|None|
|500|[Internal Server Error](https://tools.ietf.org/html/rfc7231#section-6.6.1)|Internal error|None|

<h3 id="getallmeldinger-responseschema">Response Schema</h3>

<aside class="success">
This operation does not require authentication
</aside>

## postMelding

<a id="opIdpostMelding"></a>

> Code samples

```shell
# You can also use wget
curl -X POST http://localhost:8080/api/v1/meldinger \
  -H 'Content-Type: application/json' \
  -H 'Accept: application/json'

```

```http
POST http://localhost:8080/api/v1/meldinger HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Accept: application/json

```

```javascript
const inputBody = '{
  "id": 0,
  "lastChangedTime": "string",
  "meldingsinformasjon": {
    "skjema": "string",
    "versjonsNr": "string",
    "versjonsNrOriginal": "string",
    "krgguid": "string",
    "versjonIP": 0,
    "versjonBT": 0,
    "tidspunktSubmit": "string",
    "brukernavn": "string",
    "filnavn": "string",
    "versjonInternEkstern": "string",
    "feilSkjema": true
  },
  "navigering": {
    "meldingstittel": "string",
    "meldingsNr": "string"
  },
  "stdInfo": {
    "pasientInstitusjon": {
      "fodselsnummerKRG": "string",
      "fodselsnummerHF": "string",
      "fodselnummerUtland": true,
      "fodselsnummerUtlandSpesifiser": "string",
      "navnPasient": "string",
      "sykehuskode": "string",
      "sykehusnavnRHF": "string",
      "sykehusnavnHFSorOst": "string",
      "sykehusnavnHFVest": "string",
      "sykehusnavnHFMidt": "string",
      "sykehusnavnHFNord": "string",
      "sykehusnavnSpesSenter": "string",
      "sykehusnavnHFSpesifiser": "string",
      "sykehusnavnKRGSpesifiser": "string",
      "avdelingskode": "string",
      "avdelingsnavn": "string",
      "avdelingsnavnHFSpesifiser": "string",
      "avdelingsnavnKRGSpesifiser": "string"
    },
    "kommentarfelt": {
      "kommentar": "string"
    },
    "filmBilde": {
      "filmNr": "string",
      "bildeNr": "string"
    },
    "melder": {
      "meldersNavn": "string",
      "meldeDato": "string",
      "melderID": "string"
    }
  },
  "laboratorium": {
    "labnavnKRG": "string",
    "labnavnHF": "string",
    "labnavnHFIkkeRelevant": true,
    "labnavnHFSpesifiser": "string",
    "preparatnummer": "string",
    "labkode": "string"
  },
  "behandling": {
    "kirurgi": {
      "kirurgiPrimaer": {
        "preoperativInformasjon": {
          "aktivMonitorering": "string",
          "revurderingSykdomsutrbredelse": "string",
          "preoprPSAVerdi": "string",
          "preoprPSAVerdiUkjent": "string",
          "neoadjuvantEndokrinBehandling": "string",
          "datoOppstartNeoadjBeh": "string",
          "datoOppstartNeoadjBehUkjent": "string"
        },
        "sykdomsutbredelse": {
          "tumor": {
            "palpatoriskTumorHoyre": "string",
            "palpatoriskTumorVenstre": "string",
            "samletPalpatoriskTumor": "string",
            "datoMRDiagnostikk": "string",
            "datoMRDiagnostikkUkjent": "string",
            "samletMRBasertKliniskT": "string",
            "totalVurderingKliniskT": "string",
            "kliniskVurdertAv": "string",
            "piradshoyre": "string",
            "piradsvenstre": "string",
            "mrbasertKliniskTHoyre": "string",
            "mrbasertKliniskTVenstre": "string",
            "mrdiagnostikk": "string"
          },
          "regionaleLK": {
            "regionaleLKPaavist": "string"
          },
          "fjernmetastaser": {
            "fjernmetPaavist": "string",
            "lokalisasjonFjernmet": {
              "fjerneLKmet": true,
              "skjelettmet": true,
              "annetFjernmet": true,
              "annetFjernmetSpesifiser": "string"
            }
          },
          "utredningsmetodeMetastaser": {
            "utredningsmetodeLK": "string",
            "annenDiagnostikkLKSpesifiser": "string",
            "utredningsmetodeFjernmet": {
              "skjelettscintigrafiMet": true,
              "rtgThoraxMet": true,
              "rtgBekkenMet": true,
              "cytologiMet": true,
              "biopsiMet": true,
              "annenDiagnostikkMet": true,
              "annenDiagnostikkMetSpesifiser": "string",
              "utredningsmetodeFjernmetUkjent": "string",
              "ctmet": true,
              "mrmet": true,
              "petmet": true
            }
          }
        },
        "operasjonsdatoPrimaer": "string",
        "kirurgiskBehPrimaer": {
          "typeKirurgi": "string",
          "typeKirurgiSpesifiser": "string",
          "nervesparendeIntensjon": "string",
          "samtidigLymfadenektomi": "string"
        }
      }
    }
  },
  "filnavn": "string",
  "metaData": "string",
  "skjemaNavn": "string"
}';
const headers = {
  'Content-Type':'application/json',
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/v1/meldinger',
{
  method: 'POST',
  body: inputBody,
  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Content-Type' => 'application/json',
  'Accept' => 'application/json'
}

result = RestClient.post 'http://localhost:8080/api/v1/meldinger',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Content-Type': 'application/json',
  'Accept': 'application/json'
}

r = requests.post('http://localhost:8080/api/v1/meldinger', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Content-Type' => 'application/json',
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('POST','http://localhost:8080/api/v1/meldinger', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/v1/meldinger");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("POST");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Content-Type": []string{"application/json"},
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("POST", "http://localhost:8080/api/v1/meldinger", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`POST /api/v1/meldinger`

*Legger til en melding*

Legger til en melding i databasen

> Body parameter

```json
{
  "id": 0,
  "lastChangedTime": "string",
  "meldingsinformasjon": {
    "skjema": "string",
    "versjonsNr": "string",
    "versjonsNrOriginal": "string",
    "krgguid": "string",
    "versjonIP": 0,
    "versjonBT": 0,
    "tidspunktSubmit": "string",
    "brukernavn": "string",
    "filnavn": "string",
    "versjonInternEkstern": "string",
    "feilSkjema": true
  },
  "navigering": {
    "meldingstittel": "string",
    "meldingsNr": "string"
  },
  "stdInfo": {
    "pasientInstitusjon": {
      "fodselsnummerKRG": "string",
      "fodselsnummerHF": "string",
      "fodselnummerUtland": true,
      "fodselsnummerUtlandSpesifiser": "string",
      "navnPasient": "string",
      "sykehuskode": "string",
      "sykehusnavnRHF": "string",
      "sykehusnavnHFSorOst": "string",
      "sykehusnavnHFVest": "string",
      "sykehusnavnHFMidt": "string",
      "sykehusnavnHFNord": "string",
      "sykehusnavnSpesSenter": "string",
      "sykehusnavnHFSpesifiser": "string",
      "sykehusnavnKRGSpesifiser": "string",
      "avdelingskode": "string",
      "avdelingsnavn": "string",
      "avdelingsnavnHFSpesifiser": "string",
      "avdelingsnavnKRGSpesifiser": "string"
    },
    "kommentarfelt": {
      "kommentar": "string"
    },
    "filmBilde": {
      "filmNr": "string",
      "bildeNr": "string"
    },
    "melder": {
      "meldersNavn": "string",
      "meldeDato": "string",
      "melderID": "string"
    }
  },
  "laboratorium": {
    "labnavnKRG": "string",
    "labnavnHF": "string",
    "labnavnHFIkkeRelevant": true,
    "labnavnHFSpesifiser": "string",
    "preparatnummer": "string",
    "labkode": "string"
  },
  "behandling": {
    "kirurgi": {
      "kirurgiPrimaer": {
        "preoperativInformasjon": {
          "aktivMonitorering": "string",
          "revurderingSykdomsutrbredelse": "string",
          "preoprPSAVerdi": "string",
          "preoprPSAVerdiUkjent": "string",
          "neoadjuvantEndokrinBehandling": "string",
          "datoOppstartNeoadjBeh": "string",
          "datoOppstartNeoadjBehUkjent": "string"
        },
        "sykdomsutbredelse": {
          "tumor": {
            "palpatoriskTumorHoyre": "string",
            "palpatoriskTumorVenstre": "string",
            "samletPalpatoriskTumor": "string",
            "datoMRDiagnostikk": "string",
            "datoMRDiagnostikkUkjent": "string",
            "samletMRBasertKliniskT": "string",
            "totalVurderingKliniskT": "string",
            "kliniskVurdertAv": "string",
            "piradshoyre": "string",
            "piradsvenstre": "string",
            "mrbasertKliniskTHoyre": "string",
            "mrbasertKliniskTVenstre": "string",
            "mrdiagnostikk": "string"
          },
          "regionaleLK": {
            "regionaleLKPaavist": "string"
          },
          "fjernmetastaser": {
            "fjernmetPaavist": "string",
            "lokalisasjonFjernmet": {
              "fjerneLKmet": true,
              "skjelettmet": true,
              "annetFjernmet": true,
              "annetFjernmetSpesifiser": "string"
            }
          },
          "utredningsmetodeMetastaser": {
            "utredningsmetodeLK": "string",
            "annenDiagnostikkLKSpesifiser": "string",
            "utredningsmetodeFjernmet": {
              "skjelettscintigrafiMet": true,
              "rtgThoraxMet": true,
              "rtgBekkenMet": true,
              "cytologiMet": true,
              "biopsiMet": true,
              "annenDiagnostikkMet": true,
              "annenDiagnostikkMetSpesifiser": "string",
              "utredningsmetodeFjernmetUkjent": "string",
              "ctmet": true,
              "mrmet": true,
              "petmet": true
            }
          }
        },
        "operasjonsdatoPrimaer": "string",
        "kirurgiskBehPrimaer": {
          "typeKirurgi": "string",
          "typeKirurgiSpesifiser": "string",
          "nervesparendeIntensjon": "string",
          "samtidigLymfadenektomi": "string"
        }
      }
    }
  },
  "filnavn": "string",
  "metaData": "string",
  "skjemaNavn": "string"
}
```

<h3 id="postmelding-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|any|true|none|

> Example responses

<h3 id="postmelding-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Success|None|
|500|[Internal Server Error](https://tools.ietf.org/html/rfc7231#section-6.6.1)|Internal error|None|

<h3 id="postmelding-responseschema">Response Schema</h3>

<aside class="success">
This operation does not require authentication
</aside>

## getMelding

<a id="opIdgetMelding"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8080/api/v1/meldinger/{id} \
  -H 'Accept: application/json'

```

```http
GET http://localhost:8080/api/v1/meldinger/{id} HTTP/1.1
Host: localhost:8080
Accept: application/json

```

```javascript

const headers = {
  'Accept':'application/json'
};

fetch('http://localhost:8080/api/v1/meldinger/{id}',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => 'application/json'
}

result = RestClient.get 'http://localhost:8080/api/v1/meldinger/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': 'application/json'
}

r = requests.get('http://localhost:8080/api/v1/meldinger/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => 'application/json',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8080/api/v1/meldinger/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8080/api/v1/meldinger/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"application/json"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8080/api/v1/meldinger/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /api/v1/meldinger/{id}`

*Returnerer en person*

Returnerer en person med gitt Id.

<h3 id="getmelding-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int64)|true|none|

> Example responses

> 200 Response

```json
{
  "id": 0,
  "lastChangedTime": "string",
  "meldingsinformasjon": {
    "skjema": "string",
    "versjonsNr": "string",
    "versjonsNrOriginal": "string",
    "krgguid": "string",
    "versjonIP": 0,
    "versjonBT": 0,
    "tidspunktSubmit": "string",
    "brukernavn": "string",
    "filnavn": "string",
    "versjonInternEkstern": "string",
    "feilSkjema": true
  },
  "navigering": {
    "meldingstittel": "string",
    "meldingsNr": "string"
  },
  "stdInfo": {
    "pasientInstitusjon": {
      "fodselsnummerKRG": "string",
      "fodselsnummerHF": "string",
      "fodselnummerUtland": true,
      "fodselsnummerUtlandSpesifiser": "string",
      "navnPasient": "string",
      "sykehuskode": "string",
      "sykehusnavnRHF": "string",
      "sykehusnavnHFSorOst": "string",
      "sykehusnavnHFVest": "string",
      "sykehusnavnHFMidt": "string",
      "sykehusnavnHFNord": "string",
      "sykehusnavnSpesSenter": "string",
      "sykehusnavnHFSpesifiser": "string",
      "sykehusnavnKRGSpesifiser": "string",
      "avdelingskode": "string",
      "avdelingsnavn": "string",
      "avdelingsnavnHFSpesifiser": "string",
      "avdelingsnavnKRGSpesifiser": "string"
    },
    "kommentarfelt": {
      "kommentar": "string"
    },
    "filmBilde": {
      "filmNr": "string",
      "bildeNr": "string"
    },
    "melder": {
      "meldersNavn": "string",
      "meldeDato": "string",
      "melderID": "string"
    }
  },
  "laboratorium": {
    "labnavnKRG": "string",
    "labnavnHF": "string",
    "labnavnHFIkkeRelevant": true,
    "labnavnHFSpesifiser": "string",
    "preparatnummer": "string",
    "labkode": "string"
  },
  "behandling": {
    "kirurgi": {
      "kirurgiPrimaer": {
        "preoperativInformasjon": {
          "aktivMonitorering": "string",
          "revurderingSykdomsutrbredelse": "string",
          "preoprPSAVerdi": "string",
          "preoprPSAVerdiUkjent": "string",
          "neoadjuvantEndokrinBehandling": "string",
          "datoOppstartNeoadjBeh": "string",
          "datoOppstartNeoadjBehUkjent": "string"
        },
        "sykdomsutbredelse": {
          "tumor": {
            "palpatoriskTumorHoyre": "string",
            "palpatoriskTumorVenstre": "string",
            "samletPalpatoriskTumor": "string",
            "datoMRDiagnostikk": "string",
            "datoMRDiagnostikkUkjent": "string",
            "samletMRBasertKliniskT": "string",
            "totalVurderingKliniskT": "string",
            "kliniskVurdertAv": "string",
            "piradshoyre": "string",
            "piradsvenstre": "string",
            "mrbasertKliniskTHoyre": "string",
            "mrbasertKliniskTVenstre": "string",
            "mrdiagnostikk": "string"
          },
          "regionaleLK": {
            "regionaleLKPaavist": "string"
          },
          "fjernmetastaser": {
            "fjernmetPaavist": "string",
            "lokalisasjonFjernmet": {
              "fjerneLKmet": true,
              "skjelettmet": true,
              "annetFjernmet": true,
              "annetFjernmetSpesifiser": "string"
            }
          },
          "utredningsmetodeMetastaser": {
            "utredningsmetodeLK": "string",
            "annenDiagnostikkLKSpesifiser": "string",
            "utredningsmetodeFjernmet": {
              "skjelettscintigrafiMet": true,
              "rtgThoraxMet": true,
              "rtgBekkenMet": true,
              "cytologiMet": true,
              "biopsiMet": true,
              "annenDiagnostikkMet": true,
              "annenDiagnostikkMetSpesifiser": "string",
              "utredningsmetodeFjernmetUkjent": "string",
              "ctmet": true,
              "mrmet": true,
              "petmet": true
            }
          }
        },
        "operasjonsdatoPrimaer": "string",
        "kirurgiskBehPrimaer": {
          "typeKirurgi": "string",
          "typeKirurgiSpesifiser": "string",
          "nervesparendeIntensjon": "string",
          "samtidigLymfadenektomi": "string"
        }
      }
    }
  },
  "filnavn": "string",
  "metaData": "string",
  "skjemaNavn": "string"
}
```

<h3 id="getmelding-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|Success|[KliniskProstataKirurgi](#schemakliniskprostatakirurgi)|
|404|[Not Found](https://tools.ietf.org/html/rfc7231#section-6.5.4)|Not found|None|
|500|[Internal Server Error](https://tools.ietf.org/html/rfc7231#section-6.6.1)|Internal error|None|

<aside class="success">
This operation does not require authentication
</aside>

# Schemas

<h2 id="tocS_Behandling">Behandling</h2>
<!-- backwards compatibility -->
<a id="schemabehandling"></a>
<a id="schema_Behandling"></a>
<a id="tocSbehandling"></a>
<a id="tocsbehandling"></a>

```json
{
  "kirurgi": {
    "kirurgiPrimaer": {
      "preoperativInformasjon": {
        "aktivMonitorering": "string",
        "revurderingSykdomsutrbredelse": "string",
        "preoprPSAVerdi": "string",
        "preoprPSAVerdiUkjent": "string",
        "neoadjuvantEndokrinBehandling": "string",
        "datoOppstartNeoadjBeh": "string",
        "datoOppstartNeoadjBehUkjent": "string"
      },
      "sykdomsutbredelse": {
        "tumor": {
          "palpatoriskTumorHoyre": "string",
          "palpatoriskTumorVenstre": "string",
          "samletPalpatoriskTumor": "string",
          "datoMRDiagnostikk": "string",
          "datoMRDiagnostikkUkjent": "string",
          "samletMRBasertKliniskT": "string",
          "totalVurderingKliniskT": "string",
          "kliniskVurdertAv": "string",
          "piradshoyre": "string",
          "piradsvenstre": "string",
          "mrbasertKliniskTHoyre": "string",
          "mrbasertKliniskTVenstre": "string",
          "mrdiagnostikk": "string"
        },
        "regionaleLK": {
          "regionaleLKPaavist": "string"
        },
        "fjernmetastaser": {
          "fjernmetPaavist": "string",
          "lokalisasjonFjernmet": {
            "fjerneLKmet": true,
            "skjelettmet": true,
            "annetFjernmet": true,
            "annetFjernmetSpesifiser": "string"
          }
        },
        "utredningsmetodeMetastaser": {
          "utredningsmetodeLK": "string",
          "annenDiagnostikkLKSpesifiser": "string",
          "utredningsmetodeFjernmet": {
            "skjelettscintigrafiMet": true,
            "rtgThoraxMet": true,
            "rtgBekkenMet": true,
            "cytologiMet": true,
            "biopsiMet": true,
            "annenDiagnostikkMet": true,
            "annenDiagnostikkMetSpesifiser": "string",
            "utredningsmetodeFjernmetUkjent": "string",
            "ctmet": true,
            "mrmet": true,
            "petmet": true
          }
        }
      },
      "operasjonsdatoPrimaer": "string",
      "kirurgiskBehPrimaer": {
        "typeKirurgi": "string",
        "typeKirurgiSpesifiser": "string",
        "nervesparendeIntensjon": "string",
        "samtidigLymfadenektomi": "string"
      }
    }
  }
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|kirurgi|[Kirurgi](#schemakirurgi)|false|none|none|

<h2 id="tocS_BildediagnostikkUS">BildediagnostikkUS</h2>
<!-- backwards compatibility -->
<a id="schemabildediagnostikkus"></a>
<a id="schema_BildediagnostikkUS"></a>
<a id="tocSbildediagnostikkus"></a>
<a id="tocsbildediagnostikkus"></a>

```json
{
  "datoMRDiagnostikk": "string",
  "datoMRDiagnostikkUkjent": "string",
  "annetBildediagnostikk": "string",
  "annetBildediagnostikkSpesifiser2": "string",
  "mrdiagnostikk": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|datoMRDiagnostikk|string|false|none|none|
|datoMRDiagnostikkUkjent|string|false|none|none|
|annetBildediagnostikk|string|false|none|none|
|annetBildediagnostikkSpesifiser2|string|false|none|none|
|mrdiagnostikk|string|false|none|none|

<h2 id="tocS_DiagnostiskeUS">DiagnostiskeUS</h2>
<!-- backwards compatibility -->
<a id="schemadiagnostiskeus"></a>
<a id="schema_DiagnostiskeUS"></a>
<a id="tocSdiagnostiskeus"></a>
<a id="tocsdiagnostiskeus"></a>

```json
{
  "bildediagnostikkUS": {
    "datoMRDiagnostikk": "string",
    "datoMRDiagnostikkUkjent": "string",
    "annetBildediagnostikk": "string",
    "annetBildediagnostikkSpesifiser2": "string",
    "mrdiagnostikk": "string"
  },
  "vevsprover": "string",
  "vevsproverUS": {
    "biopsiVevsprover": true,
    "annetVevsprover": true,
    "annetVevsproverSpesifiser2": "string",
    "turpvevsprover": true
  }
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|bildediagnostikkUS|[BildediagnostikkUS](#schemabildediagnostikkus)|false|none|none|
|vevsprover|string|false|none|none|
|vevsproverUS|[VevsproverUS](#schemavevsproverus)|false|none|none|

<h2 id="tocS_FilmBilde">FilmBilde</h2>
<!-- backwards compatibility -->
<a id="schemafilmbilde"></a>
<a id="schema_FilmBilde"></a>
<a id="tocSfilmbilde"></a>
<a id="tocsfilmbilde"></a>

```json
{
  "filmNr": "string",
  "bildeNr": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|filmNr|string|false|none|none|
|bildeNr|string|false|none|none|

<h2 id="tocS_Fjernmetastaser">Fjernmetastaser</h2>
<!-- backwards compatibility -->
<a id="schemafjernmetastaser"></a>
<a id="schema_Fjernmetastaser"></a>
<a id="tocSfjernmetastaser"></a>
<a id="tocsfjernmetastaser"></a>

```json
{
  "fjernmetPaavist": "string",
  "lokalisasjonFjernmet": {
    "fjerneLKmet": true,
    "skjelettmet": true,
    "annetFjernmet": true,
    "annetFjernmetSpesifiser": "string"
  }
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|fjernmetPaavist|string|false|none|none|
|lokalisasjonFjernmet|[LokalisasjonFjernmet](#schemalokalisasjonfjernmet)|false|none|none|

<h2 id="tocS_InfiltrerendeKreft">InfiltrerendeKreft</h2>
<!-- backwards compatibility -->
<a id="schemainfiltrerendekreft"></a>
<a id="schema_InfiltrerendeKreft"></a>
<a id="tocSinfiltrerendekreft"></a>
<a id="tocsinfiltrerendekreft"></a>

```json
{
  "kreft": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|kreft|string|false|none|none|

<h2 id="tocS_Kirurgi">Kirurgi</h2>
<!-- backwards compatibility -->
<a id="schemakirurgi"></a>
<a id="schema_Kirurgi"></a>
<a id="tocSkirurgi"></a>
<a id="tocskirurgi"></a>

```json
{
  "kirurgiPrimaer": {
    "preoperativInformasjon": {
      "aktivMonitorering": "string",
      "revurderingSykdomsutrbredelse": "string",
      "preoprPSAVerdi": "string",
      "preoprPSAVerdiUkjent": "string",
      "neoadjuvantEndokrinBehandling": "string",
      "datoOppstartNeoadjBeh": "string",
      "datoOppstartNeoadjBehUkjent": "string"
    },
    "sykdomsutbredelse": {
      "tumor": {
        "palpatoriskTumorHoyre": "string",
        "palpatoriskTumorVenstre": "string",
        "samletPalpatoriskTumor": "string",
        "datoMRDiagnostikk": "string",
        "datoMRDiagnostikkUkjent": "string",
        "samletMRBasertKliniskT": "string",
        "totalVurderingKliniskT": "string",
        "kliniskVurdertAv": "string",
        "piradshoyre": "string",
        "piradsvenstre": "string",
        "mrbasertKliniskTHoyre": "string",
        "mrbasertKliniskTVenstre": "string",
        "mrdiagnostikk": "string"
      },
      "regionaleLK": {
        "regionaleLKPaavist": "string"
      },
      "fjernmetastaser": {
        "fjernmetPaavist": "string",
        "lokalisasjonFjernmet": {
          "fjerneLKmet": true,
          "skjelettmet": true,
          "annetFjernmet": true,
          "annetFjernmetSpesifiser": "string"
        }
      },
      "utredningsmetodeMetastaser": {
        "utredningsmetodeLK": "string",
        "annenDiagnostikkLKSpesifiser": "string",
        "utredningsmetodeFjernmet": {
          "skjelettscintigrafiMet": true,
          "rtgThoraxMet": true,
          "rtgBekkenMet": true,
          "cytologiMet": true,
          "biopsiMet": true,
          "annenDiagnostikkMet": true,
          "annenDiagnostikkMetSpesifiser": "string",
          "utredningsmetodeFjernmetUkjent": "string",
          "ctmet": true,
          "mrmet": true,
          "petmet": true
        }
      }
    },
    "operasjonsdatoPrimaer": "string",
    "kirurgiskBehPrimaer": {
      "typeKirurgi": "string",
      "typeKirurgiSpesifiser": "string",
      "nervesparendeIntensjon": "string",
      "samtidigLymfadenektomi": "string"
    }
  }
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|kirurgiPrimaer|[KirurgiPrimaer](#schemakirurgiprimaer)|false|none|none|

<h2 id="tocS_KirurgiPrimaer">KirurgiPrimaer</h2>
<!-- backwards compatibility -->
<a id="schemakirurgiprimaer"></a>
<a id="schema_KirurgiPrimaer"></a>
<a id="tocSkirurgiprimaer"></a>
<a id="tocskirurgiprimaer"></a>

```json
{
  "preoperativInformasjon": {
    "aktivMonitorering": "string",
    "revurderingSykdomsutrbredelse": "string",
    "preoprPSAVerdi": "string",
    "preoprPSAVerdiUkjent": "string",
    "neoadjuvantEndokrinBehandling": "string",
    "datoOppstartNeoadjBeh": "string",
    "datoOppstartNeoadjBehUkjent": "string"
  },
  "sykdomsutbredelse": {
    "tumor": {
      "palpatoriskTumorHoyre": "string",
      "palpatoriskTumorVenstre": "string",
      "samletPalpatoriskTumor": "string",
      "datoMRDiagnostikk": "string",
      "datoMRDiagnostikkUkjent": "string",
      "samletMRBasertKliniskT": "string",
      "totalVurderingKliniskT": "string",
      "kliniskVurdertAv": "string",
      "piradshoyre": "string",
      "piradsvenstre": "string",
      "mrbasertKliniskTHoyre": "string",
      "mrbasertKliniskTVenstre": "string",
      "mrdiagnostikk": "string"
    },
    "regionaleLK": {
      "regionaleLKPaavist": "string"
    },
    "fjernmetastaser": {
      "fjernmetPaavist": "string",
      "lokalisasjonFjernmet": {
        "fjerneLKmet": true,
        "skjelettmet": true,
        "annetFjernmet": true,
        "annetFjernmetSpesifiser": "string"
      }
    },
    "utredningsmetodeMetastaser": {
      "utredningsmetodeLK": "string",
      "annenDiagnostikkLKSpesifiser": "string",
      "utredningsmetodeFjernmet": {
        "skjelettscintigrafiMet": true,
        "rtgThoraxMet": true,
        "rtgBekkenMet": true,
        "cytologiMet": true,
        "biopsiMet": true,
        "annenDiagnostikkMet": true,
        "annenDiagnostikkMetSpesifiser": "string",
        "utredningsmetodeFjernmetUkjent": "string",
        "ctmet": true,
        "mrmet": true,
        "petmet": true
      }
    }
  },
  "operasjonsdatoPrimaer": "string",
  "kirurgiskBehPrimaer": {
    "typeKirurgi": "string",
    "typeKirurgiSpesifiser": "string",
    "nervesparendeIntensjon": "string",
    "samtidigLymfadenektomi": "string"
  }
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|preoperativInformasjon|[PreoperativInformasjon](#schemapreoperativinformasjon)|false|none|none|
|sykdomsutbredelse|[Sykdomsutbredelse](#schemasykdomsutbredelse)|false|none|none|
|operasjonsdatoPrimaer|string|false|none|none|
|kirurgiskBehPrimaer|[KirurgiskBehPrimaer](#schemakirurgiskbehprimaer)|false|none|none|

<h2 id="tocS_KirurgiskBehPrimaer">KirurgiskBehPrimaer</h2>
<!-- backwards compatibility -->
<a id="schemakirurgiskbehprimaer"></a>
<a id="schema_KirurgiskBehPrimaer"></a>
<a id="tocSkirurgiskbehprimaer"></a>
<a id="tocskirurgiskbehprimaer"></a>

```json
{
  "typeKirurgi": "string",
  "typeKirurgiSpesifiser": "string",
  "nervesparendeIntensjon": "string",
  "samtidigLymfadenektomi": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|typeKirurgi|string|false|none|none|
|typeKirurgiSpesifiser|string|false|none|none|
|nervesparendeIntensjon|string|false|none|none|
|samtidigLymfadenektomi|string|false|none|none|

<h2 id="tocS_KliniskProstataKirurgi">KliniskProstataKirurgi</h2>
<!-- backwards compatibility -->
<a id="schemakliniskprostatakirurgi"></a>
<a id="schema_KliniskProstataKirurgi"></a>
<a id="tocSkliniskprostatakirurgi"></a>
<a id="tocskliniskprostatakirurgi"></a>

```json
{
  "id": 0,
  "lastChangedTime": "string",
  "meldingsinformasjon": {
    "skjema": "string",
    "versjonsNr": "string",
    "versjonsNrOriginal": "string",
    "krgguid": "string",
    "versjonIP": 0,
    "versjonBT": 0,
    "tidspunktSubmit": "string",
    "brukernavn": "string",
    "filnavn": "string",
    "versjonInternEkstern": "string",
    "feilSkjema": true
  },
  "navigering": {
    "meldingstittel": "string",
    "meldingsNr": "string"
  },
  "stdInfo": {
    "pasientInstitusjon": {
      "fodselsnummerKRG": "string",
      "fodselsnummerHF": "string",
      "fodselnummerUtland": true,
      "fodselsnummerUtlandSpesifiser": "string",
      "navnPasient": "string",
      "sykehuskode": "string",
      "sykehusnavnRHF": "string",
      "sykehusnavnHFSorOst": "string",
      "sykehusnavnHFVest": "string",
      "sykehusnavnHFMidt": "string",
      "sykehusnavnHFNord": "string",
      "sykehusnavnSpesSenter": "string",
      "sykehusnavnHFSpesifiser": "string",
      "sykehusnavnKRGSpesifiser": "string",
      "avdelingskode": "string",
      "avdelingsnavn": "string",
      "avdelingsnavnHFSpesifiser": "string",
      "avdelingsnavnKRGSpesifiser": "string"
    },
    "kommentarfelt": {
      "kommentar": "string"
    },
    "filmBilde": {
      "filmNr": "string",
      "bildeNr": "string"
    },
    "melder": {
      "meldersNavn": "string",
      "meldeDato": "string",
      "melderID": "string"
    }
  },
  "laboratorium": {
    "labnavnKRG": "string",
    "labnavnHF": "string",
    "labnavnHFIkkeRelevant": true,
    "labnavnHFSpesifiser": "string",
    "preparatnummer": "string",
    "labkode": "string"
  },
  "behandling": {
    "kirurgi": {
      "kirurgiPrimaer": {
        "preoperativInformasjon": {
          "aktivMonitorering": "string",
          "revurderingSykdomsutrbredelse": "string",
          "preoprPSAVerdi": "string",
          "preoprPSAVerdiUkjent": "string",
          "neoadjuvantEndokrinBehandling": "string",
          "datoOppstartNeoadjBeh": "string",
          "datoOppstartNeoadjBehUkjent": "string"
        },
        "sykdomsutbredelse": {
          "tumor": {
            "palpatoriskTumorHoyre": "string",
            "palpatoriskTumorVenstre": "string",
            "samletPalpatoriskTumor": "string",
            "datoMRDiagnostikk": "string",
            "datoMRDiagnostikkUkjent": "string",
            "samletMRBasertKliniskT": "string",
            "totalVurderingKliniskT": "string",
            "kliniskVurdertAv": "string",
            "piradshoyre": "string",
            "piradsvenstre": "string",
            "mrbasertKliniskTHoyre": "string",
            "mrbasertKliniskTVenstre": "string",
            "mrdiagnostikk": "string"
          },
          "regionaleLK": {
            "regionaleLKPaavist": "string"
          },
          "fjernmetastaser": {
            "fjernmetPaavist": "string",
            "lokalisasjonFjernmet": {
              "fjerneLKmet": true,
              "skjelettmet": true,
              "annetFjernmet": true,
              "annetFjernmetSpesifiser": "string"
            }
          },
          "utredningsmetodeMetastaser": {
            "utredningsmetodeLK": "string",
            "annenDiagnostikkLKSpesifiser": "string",
            "utredningsmetodeFjernmet": {
              "skjelettscintigrafiMet": true,
              "rtgThoraxMet": true,
              "rtgBekkenMet": true,
              "cytologiMet": true,
              "biopsiMet": true,
              "annenDiagnostikkMet": true,
              "annenDiagnostikkMetSpesifiser": "string",
              "utredningsmetodeFjernmetUkjent": "string",
              "ctmet": true,
              "mrmet": true,
              "petmet": true
            }
          }
        },
        "operasjonsdatoPrimaer": "string",
        "kirurgiskBehPrimaer": {
          "typeKirurgi": "string",
          "typeKirurgiSpesifiser": "string",
          "nervesparendeIntensjon": "string",
          "samtidigLymfadenektomi": "string"
        }
      }
    }
  },
  "filnavn": "string",
  "metaData": "string",
  "skjemaNavn": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|id|integer(int64)|false|none|none|
|lastChangedTime|string|false|none|none|
|meldingsinformasjon|[Meldingsinformasjon](#schemameldingsinformasjon)|false|none|none|
|navigering|[Navigering](#schemanavigering)|false|none|none|
|stdInfo|[StdInfo](#schemastdinfo)|false|none|none|
|laboratorium|[Laboratorium](#schemalaboratorium)|false|none|none|
|behandling|[Behandling](#schemabehandling)|false|none|none|
|filnavn|string|false|none|none|
|metaData|string|false|none|none|
|skjemaNavn|string|false|none|none|

<h2 id="tocS_KliniskProstataStraale">KliniskProstataStraale</h2>
<!-- backwards compatibility -->
<a id="schemakliniskprostatastraale"></a>
<a id="schema_KliniskProstataStraale"></a>
<a id="tocSkliniskprostatastraale"></a>
<a id="tocskliniskprostatastraale"></a>

```json
{
  "id": 0,
  "lastChangedTime": "string",
  "filnavn": "string",
  "metaData": "string",
  "skjemaNavn": "string",
  "meldingsinformasjon": {
    "skjema": "string",
    "versjonsNr": "string",
    "versjonsNrOriginal": "string",
    "krgguid": "string",
    "versjonIP": 0,
    "versjonBT": 0,
    "tidspunktSubmit": "string",
    "brukernavn": "string",
    "filnavn": "string",
    "versjonInternEkstern": "string",
    "feilSkjema": true
  },
  "navigering": {
    "meldingstittel": "string",
    "meldingsNr": "string"
  },
  "stdInfo": {
    "pasientInstitusjon": {
      "fodselsnummerKRG": "string",
      "fodselsnummerHF": "string",
      "fodselnummerUtland": true,
      "fodselsnummerUtlandSpesifiser": "string",
      "navnPasient": "string",
      "sykehuskode": "string",
      "sykehusnavnRHF": "string",
      "sykehusnavnHFSorOst": "string",
      "sykehusnavnHFVest": "string",
      "sykehusnavnHFMidt": "string",
      "sykehusnavnHFNord": "string",
      "sykehusnavnSpesSenter": "string",
      "sykehusnavnHFSpesifiser": "string",
      "sykehusnavnKRGSpesifiser": "string",
      "avdelingskode": "string",
      "avdelingsnavn": "string",
      "avdelingsnavnHFSpesifiser": "string",
      "avdelingsnavnKRGSpesifiser": "string"
    },
    "kommentarfelt": {
      "kommentar": "string"
    },
    "filmBilde": {
      "filmNr": "string",
      "bildeNr": "string"
    },
    "melder": {
      "meldersNavn": "string",
      "meldeDato": "string",
      "melderID": "string"
    }
  },
  "behandling": {
    "kirurgi": {
      "kirurgiPrimaer": {
        "preoperativInformasjon": {
          "aktivMonitorering": "string",
          "revurderingSykdomsutrbredelse": "string",
          "preoprPSAVerdi": "string",
          "preoprPSAVerdiUkjent": "string",
          "neoadjuvantEndokrinBehandling": "string",
          "datoOppstartNeoadjBeh": "string",
          "datoOppstartNeoadjBehUkjent": "string"
        },
        "sykdomsutbredelse": {
          "tumor": {
            "palpatoriskTumorHoyre": "string",
            "palpatoriskTumorVenstre": "string",
            "samletPalpatoriskTumor": "string",
            "datoMRDiagnostikk": "string",
            "datoMRDiagnostikkUkjent": "string",
            "samletMRBasertKliniskT": "string",
            "totalVurderingKliniskT": "string",
            "kliniskVurdertAv": "string",
            "piradshoyre": "string",
            "piradsvenstre": "string",
            "mrbasertKliniskTHoyre": "string",
            "mrbasertKliniskTVenstre": "string",
            "mrdiagnostikk": "string"
          },
          "regionaleLK": {
            "regionaleLKPaavist": "string"
          },
          "fjernmetastaser": {
            "fjernmetPaavist": "string",
            "lokalisasjonFjernmet": {
              "fjerneLKmet": true,
              "skjelettmet": true,
              "annetFjernmet": true,
              "annetFjernmetSpesifiser": "string"
            }
          },
          "utredningsmetodeMetastaser": {
            "utredningsmetodeLK": "string",
            "annenDiagnostikkLKSpesifiser": "string",
            "utredningsmetodeFjernmet": {
              "skjelettscintigrafiMet": true,
              "rtgThoraxMet": true,
              "rtgBekkenMet": true,
              "cytologiMet": true,
              "biopsiMet": true,
              "annenDiagnostikkMet": true,
              "annenDiagnostikkMetSpesifiser": "string",
              "utredningsmetodeFjernmetUkjent": "string",
              "ctmet": true,
              "mrmet": true,
              "petmet": true
            }
          }
        },
        "operasjonsdatoPrimaer": "string",
        "kirurgiskBehPrimaer": {
          "typeKirurgi": "string",
          "typeKirurgiSpesifiser": "string",
          "nervesparendeIntensjon": "string",
          "samtidigLymfadenektomi": "string"
        }
      }
    }
  }
}

```

### Properties

allOf

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|*anonymous*|[Melding](#schemamelding)|false|none|none|

and

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|*anonymous*|object|false|none|none|
|» meldingsinformasjon|[Meldingsinformasjon](#schemameldingsinformasjon)|false|none|none|
|» navigering|[Navigering](#schemanavigering)|false|none|none|
|» stdInfo|[StdInfo](#schemastdinfo)|false|none|none|
|» behandling|[Behandling](#schemabehandling)|false|none|none|

<h2 id="tocS_KliniskProstataUtredning">KliniskProstataUtredning</h2>
<!-- backwards compatibility -->
<a id="schemakliniskprostatautredning"></a>
<a id="schema_KliniskProstataUtredning"></a>
<a id="tocSkliniskprostatautredning"></a>
<a id="tocskliniskprostatautredning"></a>

```json
{
  "id": 0,
  "lastChangedTime": "string",
  "filnavn": "string",
  "metaData": "string",
  "skjemaNavn": "string",
  "meldingsinformasjon": {
    "skjema": "string",
    "versjonsNr": "string",
    "versjonsNrOriginal": "string",
    "krgguid": "string",
    "versjonIP": 0,
    "versjonBT": 0,
    "tidspunktSubmit": "string",
    "brukernavn": "string",
    "filnavn": "string",
    "versjonInternEkstern": "string",
    "feilSkjema": true
  },
  "navigering": {
    "meldingstittel": "string",
    "meldingsNr": "string"
  },
  "stdInfo": {
    "pasientInstitusjon": {
      "fodselsnummerKRG": "string",
      "fodselsnummerHF": "string",
      "fodselnummerUtland": true,
      "fodselsnummerUtlandSpesifiser": "string",
      "navnPasient": "string",
      "sykehuskode": "string",
      "sykehusnavnRHF": "string",
      "sykehusnavnHFSorOst": "string",
      "sykehusnavnHFVest": "string",
      "sykehusnavnHFMidt": "string",
      "sykehusnavnHFNord": "string",
      "sykehusnavnSpesSenter": "string",
      "sykehusnavnHFSpesifiser": "string",
      "sykehusnavnKRGSpesifiser": "string",
      "avdelingskode": "string",
      "avdelingsnavn": "string",
      "avdelingsnavnHFSpesifiser": "string",
      "avdelingsnavnKRGSpesifiser": "string"
    },
    "kommentarfelt": {
      "kommentar": "string"
    },
    "filmBilde": {
      "filmNr": "string",
      "bildeNr": "string"
    },
    "melder": {
      "meldersNavn": "string",
      "meldeDato": "string",
      "melderID": "string"
    }
  },
  "laboratorium": {
    "labnavnKRG": "string",
    "labnavnHF": "string",
    "labnavnHFIkkeRelevant": true,
    "labnavnHFSpesifiser": "string",
    "preparatnummer": "string",
    "labkode": "string"
  },
  "infiltrerendeKreft": {
    "kreft": "string"
  },
  "utredning": {
    "funnUtredning": "string",
    "diagnosedato": "string",
    "sykehistorie": {
      "vannlatingsproblem": "string",
      "kreftsymptomer": "string",
      "prostatavolum": "string",
      "prostatavolumUkjent": "string",
      "spsa": {
        "psaverdi": "string",
        "psaverdiIkkeTatt": true,
        "psaverdiUkjent": "string"
      },
      "whostatus": "string"
    },
    "diagnostiskeUS": {
      "bildediagnostikkUS": {
        "datoMRDiagnostikk": "string",
        "datoMRDiagnostikkUkjent": "string",
        "annetBildediagnostikk": "string",
        "annetBildediagnostikkSpesifiser2": "string",
        "mrdiagnostikk": "string"
      },
      "vevsprover": "string",
      "vevsproverUS": {
        "biopsiVevsprover": true,
        "annetVevsprover": true,
        "annetVevsproverSpesifiser2": "string",
        "turpvevsprover": true
      }
    },
    "datoMetastaser": "string",
    "sykdomsutbredelse": {
      "tumor": {
        "palpatoriskTumorHoyre": "string",
        "palpatoriskTumorVenstre": "string",
        "samletPalpatoriskTumor": "string",
        "datoMRDiagnostikk": "string",
        "datoMRDiagnostikkUkjent": "string",
        "samletMRBasertKliniskT": "string",
        "totalVurderingKliniskT": "string",
        "kliniskVurdertAv": "string",
        "piradshoyre": "string",
        "piradsvenstre": "string",
        "mrbasertKliniskTHoyre": "string",
        "mrbasertKliniskTVenstre": "string",
        "mrdiagnostikk": "string"
      },
      "regionaleLK": {
        "regionaleLKPaavist": "string"
      },
      "fjernmetastaser": {
        "fjernmetPaavist": "string",
        "lokalisasjonFjernmet": {
          "fjerneLKmet": true,
          "skjelettmet": true,
          "annetFjernmet": true,
          "annetFjernmetSpesifiser": "string"
        }
      },
      "utredningsmetodeMetastaser": {
        "utredningsmetodeLK": "string",
        "annenDiagnostikkLKSpesifiser": "string",
        "utredningsmetodeFjernmet": {
          "skjelettscintigrafiMet": true,
          "rtgThoraxMet": true,
          "rtgBekkenMet": true,
          "cytologiMet": true,
          "biopsiMet": true,
          "annenDiagnostikkMet": true,
          "annenDiagnostikkMetSpesifiser": "string",
          "utredningsmetodeFjernmetUkjent": "string",
          "ctmet": true,
          "mrmet": true,
          "petmet": true
        }
      }
    },
    "kliniskTNM": {
      "ct": "string",
      "cn": "string",
      "cm": "string"
    }
  }
}

```

### Properties

allOf

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|*anonymous*|[Melding](#schemamelding)|false|none|none|

and

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|*anonymous*|object|false|none|none|
|» meldingsinformasjon|[Meldingsinformasjon](#schemameldingsinformasjon)|false|none|none|
|» navigering|[Navigering](#schemanavigering)|false|none|none|
|» stdInfo|[StdInfo](#schemastdinfo)|false|none|none|
|» laboratorium|[Laboratorium](#schemalaboratorium)|false|none|none|
|» infiltrerendeKreft|[InfiltrerendeKreft](#schemainfiltrerendekreft)|false|none|none|
|» utredning|[Utredning](#schemautredning)|false|none|none|

<h2 id="tocS_KliniskTNM">KliniskTNM</h2>
<!-- backwards compatibility -->
<a id="schemaklinisktnm"></a>
<a id="schema_KliniskTNM"></a>
<a id="tocSklinisktnm"></a>
<a id="tocsklinisktnm"></a>

```json
{
  "ct": "string",
  "cn": "string",
  "cm": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|ct|string|false|none|none|
|cn|string|false|none|none|
|cm|string|false|none|none|

<h2 id="tocS_Kommentarfelt">Kommentarfelt</h2>
<!-- backwards compatibility -->
<a id="schemakommentarfelt"></a>
<a id="schema_Kommentarfelt"></a>
<a id="tocSkommentarfelt"></a>
<a id="tocskommentarfelt"></a>

```json
{
  "kommentar": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|kommentar|string|false|none|none|

<h2 id="tocS_Laboratorium">Laboratorium</h2>
<!-- backwards compatibility -->
<a id="schemalaboratorium"></a>
<a id="schema_Laboratorium"></a>
<a id="tocSlaboratorium"></a>
<a id="tocslaboratorium"></a>

```json
{
  "labnavnKRG": "string",
  "labnavnHF": "string",
  "labnavnHFIkkeRelevant": true,
  "labnavnHFSpesifiser": "string",
  "preparatnummer": "string",
  "labkode": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|labnavnKRG|string|false|none|none|
|labnavnHF|string|false|none|none|
|labnavnHFIkkeRelevant|boolean|false|none|none|
|labnavnHFSpesifiser|string|false|none|none|
|preparatnummer|string|false|none|none|
|labkode|string|false|none|none|

<h2 id="tocS_LokalisasjonFjernmet">LokalisasjonFjernmet</h2>
<!-- backwards compatibility -->
<a id="schemalokalisasjonfjernmet"></a>
<a id="schema_LokalisasjonFjernmet"></a>
<a id="tocSlokalisasjonfjernmet"></a>
<a id="tocslokalisasjonfjernmet"></a>

```json
{
  "fjerneLKmet": true,
  "skjelettmet": true,
  "annetFjernmet": true,
  "annetFjernmetSpesifiser": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|fjerneLKmet|boolean|false|none|none|
|skjelettmet|boolean|false|none|none|
|annetFjernmet|boolean|false|none|none|
|annetFjernmetSpesifiser|string|false|none|none|

<h2 id="tocS_Melder">Melder</h2>
<!-- backwards compatibility -->
<a id="schemamelder"></a>
<a id="schema_Melder"></a>
<a id="tocSmelder"></a>
<a id="tocsmelder"></a>

```json
{
  "meldersNavn": "string",
  "meldeDato": "string",
  "melderID": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|meldersNavn|string|false|none|none|
|meldeDato|string|false|none|none|
|melderID|string|false|none|none|

<h2 id="tocS_Melding">Melding</h2>
<!-- backwards compatibility -->
<a id="schemamelding"></a>
<a id="schema_Melding"></a>
<a id="tocSmelding"></a>
<a id="tocsmelding"></a>

```json
{
  "id": 0,
  "lastChangedTime": "string",
  "filnavn": "string",
  "metaData": "string",
  "skjemaNavn": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|id|integer(int64)|false|none|none|
|lastChangedTime|string|false|none|none|
|filnavn|string|false|none|none|
|metaData|string|false|none|none|
|skjemaNavn|string|false|none|none|

<h2 id="tocS_Meldingsinformasjon">Meldingsinformasjon</h2>
<!-- backwards compatibility -->
<a id="schemameldingsinformasjon"></a>
<a id="schema_Meldingsinformasjon"></a>
<a id="tocSmeldingsinformasjon"></a>
<a id="tocsmeldingsinformasjon"></a>

```json
{
  "skjema": "string",
  "versjonsNr": "string",
  "versjonsNrOriginal": "string",
  "krgguid": "string",
  "versjonIP": 0,
  "versjonBT": 0,
  "tidspunktSubmit": "string",
  "brukernavn": "string",
  "filnavn": "string",
  "versjonInternEkstern": "string",
  "feilSkjema": true
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|skjema|string|false|none|none|
|versjonsNr|string|false|none|none|
|versjonsNrOriginal|string|false|none|none|
|krgguid|string|false|none|none|
|versjonIP|integer|false|none|none|
|versjonBT|integer|false|none|none|
|tidspunktSubmit|string|false|none|none|
|brukernavn|string|false|none|none|
|filnavn|string|false|none|none|
|versjonInternEkstern|string|false|none|none|
|feilSkjema|boolean|false|none|none|

<h2 id="tocS_Navigering">Navigering</h2>
<!-- backwards compatibility -->
<a id="schemanavigering"></a>
<a id="schema_Navigering"></a>
<a id="tocSnavigering"></a>
<a id="tocsnavigering"></a>

```json
{
  "meldingstittel": "string",
  "meldingsNr": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|meldingstittel|string|false|none|none|
|meldingsNr|string|false|none|none|

<h2 id="tocS_PasientInstitusjon">PasientInstitusjon</h2>
<!-- backwards compatibility -->
<a id="schemapasientinstitusjon"></a>
<a id="schema_PasientInstitusjon"></a>
<a id="tocSpasientinstitusjon"></a>
<a id="tocspasientinstitusjon"></a>

```json
{
  "fodselsnummerKRG": "string",
  "fodselsnummerHF": "string",
  "fodselnummerUtland": true,
  "fodselsnummerUtlandSpesifiser": "string",
  "navnPasient": "string",
  "sykehuskode": "string",
  "sykehusnavnRHF": "string",
  "sykehusnavnHFSorOst": "string",
  "sykehusnavnHFVest": "string",
  "sykehusnavnHFMidt": "string",
  "sykehusnavnHFNord": "string",
  "sykehusnavnSpesSenter": "string",
  "sykehusnavnHFSpesifiser": "string",
  "sykehusnavnKRGSpesifiser": "string",
  "avdelingskode": "string",
  "avdelingsnavn": "string",
  "avdelingsnavnHFSpesifiser": "string",
  "avdelingsnavnKRGSpesifiser": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|fodselsnummerKRG|string|false|none|none|
|fodselsnummerHF|string|false|none|none|
|fodselnummerUtland|boolean|false|none|none|
|fodselsnummerUtlandSpesifiser|string|false|none|none|
|navnPasient|string|false|none|none|
|sykehuskode|string|false|none|none|
|sykehusnavnRHF|string|false|none|none|
|sykehusnavnHFSorOst|string|false|none|none|
|sykehusnavnHFVest|string|false|none|none|
|sykehusnavnHFMidt|string|false|none|none|
|sykehusnavnHFNord|string|false|none|none|
|sykehusnavnSpesSenter|string|false|none|none|
|sykehusnavnHFSpesifiser|string|false|none|none|
|sykehusnavnKRGSpesifiser|string|false|none|none|
|avdelingskode|string|false|none|none|
|avdelingsnavn|string|false|none|none|
|avdelingsnavnHFSpesifiser|string|false|none|none|
|avdelingsnavnKRGSpesifiser|string|false|none|none|

<h2 id="tocS_PreoperativInformasjon">PreoperativInformasjon</h2>
<!-- backwards compatibility -->
<a id="schemapreoperativinformasjon"></a>
<a id="schema_PreoperativInformasjon"></a>
<a id="tocSpreoperativinformasjon"></a>
<a id="tocspreoperativinformasjon"></a>

```json
{
  "aktivMonitorering": "string",
  "revurderingSykdomsutrbredelse": "string",
  "preoprPSAVerdi": "string",
  "preoprPSAVerdiUkjent": "string",
  "neoadjuvantEndokrinBehandling": "string",
  "datoOppstartNeoadjBeh": "string",
  "datoOppstartNeoadjBehUkjent": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|aktivMonitorering|string|false|none|none|
|revurderingSykdomsutrbredelse|string|false|none|none|
|preoprPSAVerdi|string|false|none|none|
|preoprPSAVerdiUkjent|string|false|none|none|
|neoadjuvantEndokrinBehandling|string|false|none|none|
|datoOppstartNeoadjBeh|string|false|none|none|
|datoOppstartNeoadjBehUkjent|string|false|none|none|

<h2 id="tocS_RegionaleLK">RegionaleLK</h2>
<!-- backwards compatibility -->
<a id="schemaregionalelk"></a>
<a id="schema_RegionaleLK"></a>
<a id="tocSregionalelk"></a>
<a id="tocsregionalelk"></a>

```json
{
  "regionaleLKPaavist": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|regionaleLKPaavist|string|false|none|none|

<h2 id="tocS_SPSA">SPSA</h2>
<!-- backwards compatibility -->
<a id="schemaspsa"></a>
<a id="schema_SPSA"></a>
<a id="tocSspsa"></a>
<a id="tocsspsa"></a>

```json
{
  "psaverdi": "string",
  "psaverdiIkkeTatt": true,
  "psaverdiUkjent": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|psaverdi|string|false|none|none|
|psaverdiIkkeTatt|boolean|false|none|none|
|psaverdiUkjent|string|false|none|none|

<h2 id="tocS_StdInfo">StdInfo</h2>
<!-- backwards compatibility -->
<a id="schemastdinfo"></a>
<a id="schema_StdInfo"></a>
<a id="tocSstdinfo"></a>
<a id="tocsstdinfo"></a>

```json
{
  "pasientInstitusjon": {
    "fodselsnummerKRG": "string",
    "fodselsnummerHF": "string",
    "fodselnummerUtland": true,
    "fodselsnummerUtlandSpesifiser": "string",
    "navnPasient": "string",
    "sykehuskode": "string",
    "sykehusnavnRHF": "string",
    "sykehusnavnHFSorOst": "string",
    "sykehusnavnHFVest": "string",
    "sykehusnavnHFMidt": "string",
    "sykehusnavnHFNord": "string",
    "sykehusnavnSpesSenter": "string",
    "sykehusnavnHFSpesifiser": "string",
    "sykehusnavnKRGSpesifiser": "string",
    "avdelingskode": "string",
    "avdelingsnavn": "string",
    "avdelingsnavnHFSpesifiser": "string",
    "avdelingsnavnKRGSpesifiser": "string"
  },
  "kommentarfelt": {
    "kommentar": "string"
  },
  "filmBilde": {
    "filmNr": "string",
    "bildeNr": "string"
  },
  "melder": {
    "meldersNavn": "string",
    "meldeDato": "string",
    "melderID": "string"
  }
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|pasientInstitusjon|[PasientInstitusjon](#schemapasientinstitusjon)|false|none|none|
|kommentarfelt|[Kommentarfelt](#schemakommentarfelt)|false|none|none|
|filmBilde|[FilmBilde](#schemafilmbilde)|false|none|none|
|melder|[Melder](#schemamelder)|false|none|none|

<h2 id="tocS_Sykdomsutbredelse">Sykdomsutbredelse</h2>
<!-- backwards compatibility -->
<a id="schemasykdomsutbredelse"></a>
<a id="schema_Sykdomsutbredelse"></a>
<a id="tocSsykdomsutbredelse"></a>
<a id="tocssykdomsutbredelse"></a>

```json
{
  "tumor": {
    "palpatoriskTumorHoyre": "string",
    "palpatoriskTumorVenstre": "string",
    "samletPalpatoriskTumor": "string",
    "datoMRDiagnostikk": "string",
    "datoMRDiagnostikkUkjent": "string",
    "samletMRBasertKliniskT": "string",
    "totalVurderingKliniskT": "string",
    "kliniskVurdertAv": "string",
    "piradshoyre": "string",
    "piradsvenstre": "string",
    "mrbasertKliniskTHoyre": "string",
    "mrbasertKliniskTVenstre": "string",
    "mrdiagnostikk": "string"
  },
  "regionaleLK": {
    "regionaleLKPaavist": "string"
  },
  "fjernmetastaser": {
    "fjernmetPaavist": "string",
    "lokalisasjonFjernmet": {
      "fjerneLKmet": true,
      "skjelettmet": true,
      "annetFjernmet": true,
      "annetFjernmetSpesifiser": "string"
    }
  },
  "utredningsmetodeMetastaser": {
    "utredningsmetodeLK": "string",
    "annenDiagnostikkLKSpesifiser": "string",
    "utredningsmetodeFjernmet": {
      "skjelettscintigrafiMet": true,
      "rtgThoraxMet": true,
      "rtgBekkenMet": true,
      "cytologiMet": true,
      "biopsiMet": true,
      "annenDiagnostikkMet": true,
      "annenDiagnostikkMetSpesifiser": "string",
      "utredningsmetodeFjernmetUkjent": "string",
      "ctmet": true,
      "mrmet": true,
      "petmet": true
    }
  }
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|tumor|[Tumor](#schematumor)|false|none|none|
|regionaleLK|[RegionaleLK](#schemaregionalelk)|false|none|none|
|fjernmetastaser|[Fjernmetastaser](#schemafjernmetastaser)|false|none|none|
|utredningsmetodeMetastaser|[UtredningsmetodeMetastaser](#schemautredningsmetodemetastaser)|false|none|none|

<h2 id="tocS_Sykehistorie">Sykehistorie</h2>
<!-- backwards compatibility -->
<a id="schemasykehistorie"></a>
<a id="schema_Sykehistorie"></a>
<a id="tocSsykehistorie"></a>
<a id="tocssykehistorie"></a>

```json
{
  "vannlatingsproblem": "string",
  "kreftsymptomer": "string",
  "prostatavolum": "string",
  "prostatavolumUkjent": "string",
  "spsa": {
    "psaverdi": "string",
    "psaverdiIkkeTatt": true,
    "psaverdiUkjent": "string"
  },
  "whostatus": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|vannlatingsproblem|string|false|none|none|
|kreftsymptomer|string|false|none|none|
|prostatavolum|string|false|none|none|
|prostatavolumUkjent|string|false|none|none|
|spsa|[SPSA](#schemaspsa)|false|none|none|
|whostatus|string|false|none|none|

<h2 id="tocS_Tumor">Tumor</h2>
<!-- backwards compatibility -->
<a id="schematumor"></a>
<a id="schema_Tumor"></a>
<a id="tocStumor"></a>
<a id="tocstumor"></a>

```json
{
  "palpatoriskTumorHoyre": "string",
  "palpatoriskTumorVenstre": "string",
  "samletPalpatoriskTumor": "string",
  "datoMRDiagnostikk": "string",
  "datoMRDiagnostikkUkjent": "string",
  "samletMRBasertKliniskT": "string",
  "totalVurderingKliniskT": "string",
  "kliniskVurdertAv": "string",
  "piradshoyre": "string",
  "piradsvenstre": "string",
  "mrbasertKliniskTHoyre": "string",
  "mrbasertKliniskTVenstre": "string",
  "mrdiagnostikk": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|palpatoriskTumorHoyre|string|false|none|none|
|palpatoriskTumorVenstre|string|false|none|none|
|samletPalpatoriskTumor|string|false|none|none|
|datoMRDiagnostikk|string|false|none|none|
|datoMRDiagnostikkUkjent|string|false|none|none|
|samletMRBasertKliniskT|string|false|none|none|
|totalVurderingKliniskT|string|false|none|none|
|kliniskVurdertAv|string|false|none|none|
|piradshoyre|string|false|none|none|
|piradsvenstre|string|false|none|none|
|mrbasertKliniskTHoyre|string|false|none|none|
|mrbasertKliniskTVenstre|string|false|none|none|
|mrdiagnostikk|string|false|none|none|

<h2 id="tocS_Utredning">Utredning</h2>
<!-- backwards compatibility -->
<a id="schemautredning"></a>
<a id="schema_Utredning"></a>
<a id="tocSutredning"></a>
<a id="tocsutredning"></a>

```json
{
  "funnUtredning": "string",
  "diagnosedato": "string",
  "sykehistorie": {
    "vannlatingsproblem": "string",
    "kreftsymptomer": "string",
    "prostatavolum": "string",
    "prostatavolumUkjent": "string",
    "spsa": {
      "psaverdi": "string",
      "psaverdiIkkeTatt": true,
      "psaverdiUkjent": "string"
    },
    "whostatus": "string"
  },
  "diagnostiskeUS": {
    "bildediagnostikkUS": {
      "datoMRDiagnostikk": "string",
      "datoMRDiagnostikkUkjent": "string",
      "annetBildediagnostikk": "string",
      "annetBildediagnostikkSpesifiser2": "string",
      "mrdiagnostikk": "string"
    },
    "vevsprover": "string",
    "vevsproverUS": {
      "biopsiVevsprover": true,
      "annetVevsprover": true,
      "annetVevsproverSpesifiser2": "string",
      "turpvevsprover": true
    }
  },
  "datoMetastaser": "string",
  "sykdomsutbredelse": {
    "tumor": {
      "palpatoriskTumorHoyre": "string",
      "palpatoriskTumorVenstre": "string",
      "samletPalpatoriskTumor": "string",
      "datoMRDiagnostikk": "string",
      "datoMRDiagnostikkUkjent": "string",
      "samletMRBasertKliniskT": "string",
      "totalVurderingKliniskT": "string",
      "kliniskVurdertAv": "string",
      "piradshoyre": "string",
      "piradsvenstre": "string",
      "mrbasertKliniskTHoyre": "string",
      "mrbasertKliniskTVenstre": "string",
      "mrdiagnostikk": "string"
    },
    "regionaleLK": {
      "regionaleLKPaavist": "string"
    },
    "fjernmetastaser": {
      "fjernmetPaavist": "string",
      "lokalisasjonFjernmet": {
        "fjerneLKmet": true,
        "skjelettmet": true,
        "annetFjernmet": true,
        "annetFjernmetSpesifiser": "string"
      }
    },
    "utredningsmetodeMetastaser": {
      "utredningsmetodeLK": "string",
      "annenDiagnostikkLKSpesifiser": "string",
      "utredningsmetodeFjernmet": {
        "skjelettscintigrafiMet": true,
        "rtgThoraxMet": true,
        "rtgBekkenMet": true,
        "cytologiMet": true,
        "biopsiMet": true,
        "annenDiagnostikkMet": true,
        "annenDiagnostikkMetSpesifiser": "string",
        "utredningsmetodeFjernmetUkjent": "string",
        "ctmet": true,
        "mrmet": true,
        "petmet": true
      }
    }
  },
  "kliniskTNM": {
    "ct": "string",
    "cn": "string",
    "cm": "string"
  }
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|funnUtredning|string|false|none|none|
|diagnosedato|string|false|none|none|
|sykehistorie|[Sykehistorie](#schemasykehistorie)|false|none|none|
|diagnostiskeUS|[DiagnostiskeUS](#schemadiagnostiskeus)|false|none|none|
|datoMetastaser|string|false|none|none|
|sykdomsutbredelse|[Sykdomsutbredelse](#schemasykdomsutbredelse)|false|none|none|
|kliniskTNM|[KliniskTNM](#schemaklinisktnm)|false|none|none|

<h2 id="tocS_UtredningsmetodeFjernmet">UtredningsmetodeFjernmet</h2>
<!-- backwards compatibility -->
<a id="schemautredningsmetodefjernmet"></a>
<a id="schema_UtredningsmetodeFjernmet"></a>
<a id="tocSutredningsmetodefjernmet"></a>
<a id="tocsutredningsmetodefjernmet"></a>

```json
{
  "skjelettscintigrafiMet": true,
  "rtgThoraxMet": true,
  "rtgBekkenMet": true,
  "cytologiMet": true,
  "biopsiMet": true,
  "annenDiagnostikkMet": true,
  "annenDiagnostikkMetSpesifiser": "string",
  "utredningsmetodeFjernmetUkjent": "string",
  "ctmet": true,
  "mrmet": true,
  "petmet": true
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|skjelettscintigrafiMet|boolean|false|none|none|
|rtgThoraxMet|boolean|false|none|none|
|rtgBekkenMet|boolean|false|none|none|
|cytologiMet|boolean|false|none|none|
|biopsiMet|boolean|false|none|none|
|annenDiagnostikkMet|boolean|false|none|none|
|annenDiagnostikkMetSpesifiser|string|false|none|none|
|utredningsmetodeFjernmetUkjent|string|false|none|none|
|ctmet|boolean|false|none|none|
|mrmet|boolean|false|none|none|
|petmet|boolean|false|none|none|

<h2 id="tocS_UtredningsmetodeMetastaser">UtredningsmetodeMetastaser</h2>
<!-- backwards compatibility -->
<a id="schemautredningsmetodemetastaser"></a>
<a id="schema_UtredningsmetodeMetastaser"></a>
<a id="tocSutredningsmetodemetastaser"></a>
<a id="tocsutredningsmetodemetastaser"></a>

```json
{
  "utredningsmetodeLK": "string",
  "annenDiagnostikkLKSpesifiser": "string",
  "utredningsmetodeFjernmet": {
    "skjelettscintigrafiMet": true,
    "rtgThoraxMet": true,
    "rtgBekkenMet": true,
    "cytologiMet": true,
    "biopsiMet": true,
    "annenDiagnostikkMet": true,
    "annenDiagnostikkMetSpesifiser": "string",
    "utredningsmetodeFjernmetUkjent": "string",
    "ctmet": true,
    "mrmet": true,
    "petmet": true
  }
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|utredningsmetodeLK|string|false|none|none|
|annenDiagnostikkLKSpesifiser|string|false|none|none|
|utredningsmetodeFjernmet|[UtredningsmetodeFjernmet](#schemautredningsmetodefjernmet)|false|none|none|

<h2 id="tocS_VevsproverUS">VevsproverUS</h2>
<!-- backwards compatibility -->
<a id="schemavevsproverus"></a>
<a id="schema_VevsproverUS"></a>
<a id="tocSvevsproverus"></a>
<a id="tocsvevsproverus"></a>

```json
{
  "biopsiVevsprover": true,
  "annetVevsprover": true,
  "annetVevsproverSpesifiser2": "string",
  "turpvevsprover": true
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|biopsiVevsprover|boolean|false|none|none|
|annetVevsprover|boolean|false|none|none|
|annetVevsproverSpesifiser2|string|false|none|none|
|turpvevsprover|boolean|false|none|none|

