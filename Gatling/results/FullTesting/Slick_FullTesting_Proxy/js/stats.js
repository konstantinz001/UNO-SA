var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "10670",
        "ok": "6179",
        "ko": "4491"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "26"
    },
    "maxResponseTime": {
        "total": "20447",
        "ok": "20135",
        "ko": "20447"
    },
    "meanResponseTime": {
        "total": "1320",
        "ok": "601",
        "ko": "2310"
    },
    "standardDeviation": {
        "total": "2358",
        "ok": "1570",
        "ko": "2852"
    },
    "percentiles1": {
        "total": "179",
        "ok": "30",
        "ko": "2107"
    },
    "percentiles2": {
        "total": "2138",
        "ok": "386",
        "ko": "2339"
    },
    "percentiles3": {
        "total": "4029",
        "ok": "3312",
        "ko": "4904"
    },
    "percentiles4": {
        "total": "15124",
        "ok": "5548",
        "ko": "18582"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 4999,
    "percentage": 47
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 199,
    "percentage": 2
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 981,
    "percentage": 9
},
    "group4": {
    "name": "failed",
    "count": 4491,
    "percentage": 42
},
    "meanNumberOfRequestsPerSecond": {
        "total": "35.099",
        "ok": "20.326",
        "ko": "14.773"
    }
},
contents: {
"req_load-ec4d1": {
        type: "REQUEST",
        name: "load",
path: "load",
pathFormatted: "req_load-ec4d1",
stats: {
    "name": "load",
    "numberOfRequests": {
        "total": "5335",
        "ok": "1948",
        "ko": "3387"
    },
    "minResponseTime": {
        "total": "26",
        "ok": "26",
        "ko": "26"
    },
    "maxResponseTime": {
        "total": "20447",
        "ok": "20135",
        "ko": "20447"
    },
    "meanResponseTime": {
        "total": "1875",
        "ok": "993",
        "ko": "2382"
    },
    "standardDeviation": {
        "total": "3041",
        "ok": "2321",
        "ko": "3280"
    },
    "percentiles1": {
        "total": "1616",
        "ok": "36",
        "ko": "2152"
    },
    "percentiles2": {
        "total": "2356",
        "ok": "1308",
        "ko": "2530"
    },
    "percentiles3": {
        "total": "4902",
        "ok": "4188",
        "ko": "6416"
    },
    "percentiles4": {
        "total": "18758",
        "ok": "12696",
        "ko": "19441"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1375,
    "percentage": 26
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 62,
    "percentage": 1
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 511,
    "percentage": 10
},
    "group4": {
    "name": "failed",
    "count": 3387,
    "percentage": 63
},
    "meanNumberOfRequestsPerSecond": {
        "total": "17.549",
        "ok": "6.408",
        "ko": "11.141"
    }
}
    },"req_save-43781": {
        type: "REQUEST",
        name: "save",
path: "save",
pathFormatted: "req_save-43781",
stats: {
    "name": "save",
    "numberOfRequests": {
        "total": "5335",
        "ok": "4231",
        "ko": "1104"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "2000"
    },
    "maxResponseTime": {
        "total": "12403",
        "ok": "12403",
        "ko": "2267"
    },
    "meanResponseTime": {
        "total": "765",
        "ok": "420",
        "ko": "2089"
    },
    "standardDeviation": {
        "total": "1124",
        "ok": "1007",
        "ko": "70"
    },
    "percentiles1": {
        "total": "15",
        "ok": "3",
        "ko": "2057"
    },
    "percentiles2": {
        "total": "2020",
        "ok": "264",
        "ko": "2157"
    },
    "percentiles3": {
        "total": "2414",
        "ok": "2628",
        "ko": "2218"
    },
    "percentiles4": {
        "total": "4550",
        "ok": "5158",
        "ko": "2249"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 3624,
    "percentage": 68
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 137,
    "percentage": 3
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 470,
    "percentage": 9
},
    "group4": {
    "name": "failed",
    "count": 1104,
    "percentage": 21
},
    "meanNumberOfRequestsPerSecond": {
        "total": "17.549",
        "ok": "13.918",
        "ko": "3.632"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
