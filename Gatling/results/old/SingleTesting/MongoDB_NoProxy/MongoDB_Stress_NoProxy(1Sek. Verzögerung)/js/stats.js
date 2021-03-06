var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "3060",
        "ok": "1898",
        "ko": "1162"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "15"
    },
    "maxResponseTime": {
        "total": "9013",
        "ok": "9013",
        "ko": "8979"
    },
    "meanResponseTime": {
        "total": "1903",
        "ok": "1551",
        "ko": "2477"
    },
    "standardDeviation": {
        "total": "2194",
        "ok": "2477",
        "ko": "1459"
    },
    "percentiles1": {
        "total": "2016",
        "ok": "17",
        "ko": "2033"
    },
    "percentiles2": {
        "total": "2049",
        "ok": "3147",
        "ko": "2048"
    },
    "percentiles3": {
        "total": "6489",
        "ok": "6770",
        "ko": "6387"
    },
    "percentiles4": {
        "total": "7443",
        "ok": "7818",
        "ko": "7358"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 1270,
    "percentage": 42
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 87,
    "percentage": 3
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 541,
    "percentage": 18
},
    "group4": {
    "name": "failed",
    "count": 1162,
    "percentage": 38
},
    "meanNumberOfRequestsPerSecond": {
        "total": "44.348",
        "ok": "27.507",
        "ko": "16.841"
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
        "total": "1530",
        "ok": "756",
        "ko": "774"
    },
    "minResponseTime": {
        "total": "14",
        "ok": "14",
        "ko": "15"
    },
    "maxResponseTime": {
        "total": "9013",
        "ok": "9013",
        "ko": "8979"
    },
    "meanResponseTime": {
        "total": "2799",
        "ok": "2900",
        "ko": "2701"
    },
    "standardDeviation": {
        "total": "2376",
        "ok": "2878",
        "ko": "1745"
    },
    "percentiles1": {
        "total": "2033",
        "ok": "2189",
        "ko": "2033"
    },
    "percentiles2": {
        "total": "5001",
        "ok": "5857",
        "ko": "2059"
    },
    "percentiles3": {
        "total": "7001",
        "ok": "7380",
        "ko": "6529"
    },
    "percentiles4": {
        "total": "7898",
        "ok": "8153",
        "ko": "7404"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 329,
    "percentage": 22
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 25,
    "percentage": 2
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 402,
    "percentage": 26
},
    "group4": {
    "name": "failed",
    "count": 774,
    "percentage": 51
},
    "meanNumberOfRequestsPerSecond": {
        "total": "22.174",
        "ok": "10.957",
        "ko": "11.217"
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
        "total": "1530",
        "ok": "1142",
        "ko": "388"
    },
    "minResponseTime": {
        "total": "1",
        "ok": "1",
        "ko": "2001"
    },
    "maxResponseTime": {
        "total": "7028",
        "ok": "7028",
        "ko": "2078"
    },
    "meanResponseTime": {
        "total": "1007",
        "ok": "659",
        "ko": "2031"
    },
    "standardDeviation": {
        "total": "1543",
        "ok": "1647",
        "ko": "14"
    },
    "percentiles1": {
        "total": "10",
        "ok": "5",
        "ko": "2032"
    },
    "percentiles2": {
        "total": "2031",
        "ok": "15",
        "ko": "2035"
    },
    "percentiles3": {
        "total": "4881",
        "ok": "5360",
        "ko": "2051"
    },
    "percentiles4": {
        "total": "6057",
        "ok": "6312",
        "ko": "2064"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 941,
    "percentage": 62
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 62,
    "percentage": 4
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 139,
    "percentage": 9
},
    "group4": {
    "name": "failed",
    "count": 388,
    "percentage": 25
},
    "meanNumberOfRequestsPerSecond": {
        "total": "22.174",
        "ok": "16.551",
        "ko": "5.623"
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
